package cn.hma.sbm.service.impl;


import cn.hma.sbm.entity.User;
import cn.hma.sbm.mapper.UserMapper;
import cn.hma.sbm.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mxj
 * @since 2018-07-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	@Override
    public boolean deleteAll() {
	    return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<User> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

}
