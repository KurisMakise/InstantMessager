package makise.im.service.impl;

import makise.im.entity.User;
import makise.im.mapper.UserMapper;
import makise.im.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:18
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(@Qualifier("userMapper") UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(String uid) {
        return userMapper.delete(uid);
    }
}
