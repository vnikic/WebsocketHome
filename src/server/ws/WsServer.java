package server.ws;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocketendpoint")
public class WsServer {

    @OnOpen
    public void onOpen(){
        System.out.println("Open Connection ...");
    }

    @OnClose
    public void onClose(){
        System.out.println("Close Connection ...");
    }

    @OnMessage
    public String onMessage(String message, Session session){
        System.out.println("Message from the client: " + message);
        String echoMsg = "Echo from the server : " + message;
        return echoMsg;
    }
    @OnError
    public void onError(Throwable e){
        e.printStackTrace();
    }

}
