package et.telebof.requests;

public class SetChatTitle extends AbstractBaseRequest<SetChatTitle, Boolean> {
    public SetChatTitle(Object chatId, String title, RequestSender requestSender) {
        super(chatId, requestSender, "setChatTitle");
        add("title", title);
    }

    @Override
    public Boolean exec() {
        Object response = requestSender.makeRequest(this);
        return (Boolean) response;
    }
}
