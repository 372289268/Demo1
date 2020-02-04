package cn.tedu.uo.mapper;

import cn.tedu.uo.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    void updatePoint(@Param("userId") String userId,@Param("point") int point);
    User queryUserById(String userId);
}
