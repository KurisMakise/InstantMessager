package makise.im.mapper;

import makise.im.entity.MessageContact;

/**
 * 最近消息
 *
 * @author k.makise
 * @version 1.0
 * @since 2020/8/18 0:30
 */
public interface MessageContactMapper {

    /**
     * 保存最近联系人
     *
     * @param messageContact
     * @return
     */
    int save(MessageContact messageContact);

    /**
     * 更新最近联系人
     *
     * @param messageContact
     * @return
     */
    int update(MessageContact messageContact);
}
