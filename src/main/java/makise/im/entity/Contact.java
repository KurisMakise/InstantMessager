package makise.im.entity;

import lombok.Data;

import java.util.Date;

/**
 * 联系人表
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 18:06
 */
@Data
public class Contact {

    /**
     * 归属人
     */
    private String ownerUid;
    /**
     * 关联人
     */
    private String otherUid;
    /**
     * 创建时间
     */
    private Date createTime;
}
