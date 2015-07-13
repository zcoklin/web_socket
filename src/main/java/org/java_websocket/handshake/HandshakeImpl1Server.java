package org.java_websocket.handshake;

public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder
{
    public HandshakeImpl1Server()
    {
    }

    private short  httpstatus;

    private String httpstatusmessage;

    @Override
    public short getHttpStatus()
    {
        return httpstatus;
    }

    @Override
    public String getHttpStatusMessage()
    {
        return httpstatusmessage;
    }

    public void setHttpStatus(short status)
    {
        httpstatus = status;
    }

    public void setHttpStatusMessage(String message)
    {
        this.httpstatusmessage = message;
    }

}
