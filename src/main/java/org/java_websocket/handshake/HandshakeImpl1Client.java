package org.java_websocket.handshake;

public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder
{
    public HandshakeImpl1Client()
    {
    }

    private String resourceDescriptor = "*";

    public String getResourceDescriptor()
    {
        return resourceDescriptor;
    }

    public void setResourceDescriptor(String resourceDescriptor) throws IllegalArgumentException
    {
        if (resourceDescriptor == null)
        {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.resourceDescriptor = resourceDescriptor;
    }
}
