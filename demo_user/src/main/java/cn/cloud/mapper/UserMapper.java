package cn.cloud.mapper;


import cn.cloud.pojp.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Long id);
}
