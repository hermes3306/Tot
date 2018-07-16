package a.b.c;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("realTimeService")
public class RealTimeServiceImpl implements RealTimeService{
	@Resource(name="realTimeDAO" + "")
	private RealTimeDao realtimeDao;
	@Override
	public List<Map<String, Object>> selectList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		
		return realtimeDao.selectList(map);
	}
	@Override
	public List<Map<String, Object>> selectGraphList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		
		return realtimeDao.selectGraphList(map);
	}
	@Override
	public List<Map<String, Object>> selectGraphList(String sqlParam,Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		
		return realtimeDao.selectParamList(sqlParam,map);
	}
	@Override
	public GraphLimit selectGraphOne(String sqlParam) throws Exception {
		// TODO Auto-generated method stub
		
		return (GraphLimit)realtimeDao.selectOne(sqlParam);
	}
	
}


