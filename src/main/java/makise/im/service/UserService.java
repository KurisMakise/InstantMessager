package makise.im.service;

import makise.im.entity.User;

/**
 * 用户服务
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 19:15
 */
public interface UserService {

    /**
     * 插入用户
     *
     * @param user 用户信息
     * @return 是否插入用户成功
     */
    int save(User user);

    /**
     * 更新用户
     *
     * @param user 用户信息
     * @return 更新用户信息
     */
    int update(User user);

    /**
     * 删除用户信息
     *
     * @param uid 用户ID
     * @return 是否删除成功
     */
    int delete(String uid);

}
