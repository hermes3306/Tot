package a.b.c;

import java.util.List;
import java.util.Map;

public interface RealTimeService {
	public List<Map<String, Object>> selectList(Map<String, Object> map) throws Exception;
	public List<Map<String, Object>> selectGraphList(Map<String, Object> map) throws Exception;
	public List<Map<String, Object>> selectGraphList(String sqlParam ,Map<String, Object> map) throws Exception;
	public GraphLimit selectGraphOne(String sqlParam) throws Exception;
}
