package et.telebof.requests;

public class SetCustomEmojiStickerSetThumbnail extends AbstractBaseRequest<SetCustomEmojiStickerSetThumbnail, Boolean> {
    public SetCustomEmojiStickerSetThumbnail(String name, String customEmojiId, RequestSender requestSender) {
        super(requestSender, "setCustomEmojiStickerSetThumbnail");
        add("name", name);
        add("custom_emoji_id", customEmojiId);
    }

    @Override
    public Boolean exec() {
        Object response = requestSender.makeRequest(this);
        return (Boolean) response;
    }
}
