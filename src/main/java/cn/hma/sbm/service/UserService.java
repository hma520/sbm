package cn.hma.sbm.service;

import cn.hma.sbm.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mxj
 * @since 2018-07-02
 */
public interface UserService extends IService<User> {
    boolean deleteAll();

    public List<User> selectListBySQL();
}
