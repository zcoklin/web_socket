import java.net.URI;
import java.net.URISyntaxException;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;

/**
 * This example demonstrates how to create a websocket connection to a server.
 * Only the most important callbacks are overloaded.
 */
public class ExampleClient extends WebSocketClient
{

    public ExampleClient(URI serverURI)
    {
        super(serverURI);
    }

    public ExampleClient(URI serverUri, Draft draft)
    {
        super(serverUri, draft);
    }

    public static void main(String[] args) throws URISyntaxException
    {
        ExampleClient c = new ExampleClient(new URI("ws://localhost:8887"), new Draft_10()); // more
                                                                                             // about
                                                                                             // drafts
                                                                                             // here:
                                                                                             // http://github.com/TooTallNate/Java-WebSocket/wiki/Drafts
        c.connect();
    }

    @Override
    public void onClose(int code, String reason, boolean remote)
    {
        // The codecodes are documented in class
        // org.java_websocket.framing.CloseFrame
    }

    @Override
    public void onError(Exception ex)
    {
        ex.printStackTrace();
        // if the error is fatal then onClose will be called additionally
    }

    @Override
    public void onFragment(Framedata fragment)
    {
    }

    @Override
    public void onMessage(String message)
    {
    }

    @Override
    public void onOpen(ServerHandshake handshakedata)
    {
        // if you plan to refuse connection based on ip or httpfields overload:
        // onWebsocketHandshakeReceivedAsClient
    }

}