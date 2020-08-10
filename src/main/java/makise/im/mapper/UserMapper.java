package makise.im.mapper;

import makise.im.entity.User;

/**
 * 用户查询
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/9 12:02
 */
public interface UserMapper {
    /**
     * 保存用户
     *
     * @param user 用户信息
     * @return 是否成功
     */
    int save(User user);

    /**
     * 更新用户
     *
     * @param user 用户信息
     * @return 是否成功
     */
    int update(User user);

    /**
     * 删除用户
     *
     * @param uid 用户id
     * @return 是否成功
     */
    int delete(String uid);
}
