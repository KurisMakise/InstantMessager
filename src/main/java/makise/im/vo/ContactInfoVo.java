package makise.im.vo;

import lombok.Data;

import java.util.List;

/**
 * 最近联系人信息
 *
 * @author kurisu makise
 * @version 1.0
 * @since 2020/8/17 0:17
 */
@Data
public class ContactInfoVo {
    /**
     * 联系人列表
     */
    private List<ContactInfo> contactInfoList;

    /**
     * 总未读数
     */
    private int totalUnRead;


    /**
     * 最近联系人
     */
    @Data
    private class ContactInfo {
        /**
         * 拥有者id
         */
        private String ownerUid;
        /**
         * 对方id
         */
        private String otherUid;
        /**
         * 对方姓名
         */
        private String otherName;
        /**
         * 最近消息内容
         */
        private String content;

        /**
         * 未读数
         */
        private int unRead;
    }

}
