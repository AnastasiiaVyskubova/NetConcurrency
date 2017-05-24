package app;

import netutils.MessageHandler;

/**
 * NetConcurrency created by 14Viskubova on 23.05.2017.
 */
public class PrintMessageHandler implements MessageHandler {
    @Override
    public void handle (String message){
        System.out.println(message);
    }
}
