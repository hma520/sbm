package cn.hma.sbm.mapper;


import cn.hma.sbm.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author mxj
 * @since 2018-07-02
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select id, name, age from user")
    List<User> selectListBySQL();
}