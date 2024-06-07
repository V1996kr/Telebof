package et.telebof.requests;

import et.telebof.types.BotCommand;
import et.telebof.types.BotCommandScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SetMyCommands extends AbstractBaseRequest<SetMyCommands, Boolean> {
    public SetMyCommands(BotCommand[] commands, RequestSender requestSender) {
        super(requestSender, "setMyCommands");
        add("commands", List.of(commands));
    }

    public SetMyCommands scope(BotCommandScope botCommandScope) {
        return add("scope", botCommandScope);
    }

    public SetMyCommands languageCode(String languageCode) {
        return add("language_code", languageCode);
    }

    @Override
    public Boolean exec() {
        Object response = requestSender.makeRequest(this);
        return (Boolean) response;
    }
}
