package makise.im.vo;

import lombok.Data;

/**
 * 消息
 *
 * @author kurisu makise
 * @version 1.0
 * @date 2020/8/7 20:05
 */
@Data
public class MessageVo {
    private String ownerUid;
    private String otherUid;

    private String content;
}
