package et.telebof.requests;

public class EditForumTopic extends AbstractBaseRequest<EditForumTopic, Boolean> {
    public EditForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "editForumTopic");
        add("message_thread_id", messageThreadId);
    }

    public EditForumTopic name(String name) {
        return add("name", name);

    }
    public EditForumTopic iconCustomEmojiId(String iconCustomEmojiId) {
        return add("icon_custom_emoji_id", iconCustomEmojiId);
    }

    @Override
    public Boolean exec() {
        Object response = requestSender.makeRequest(this);
        return (Boolean) response;
    }
}
