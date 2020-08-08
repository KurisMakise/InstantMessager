package makise.im.entity;

import lombok.Data;

/**
 * 用户实体
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 17:14
 */
@Data
public class User {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String avatar;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;
}
