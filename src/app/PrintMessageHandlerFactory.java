package app;

import netutils.MessageHandler;
        import netutils.MessageHandlerFactory;

/**
 * Created by 14Viskubova on 24.05.2017.
 */

public class PrintMessageHandlerFactory implements MessageHandlerFactory {
    @Override
    public MessageHandler create(){
        return new PrintMessageHandler();
    }
}
