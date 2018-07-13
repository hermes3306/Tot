package j.h.p;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {// mapper XML 파일 대신 annotation 사용가능!
	@Select("SELECT name FROM product WHERE id = #{id}")
	String getUser(@Param("id") int id);
}
 