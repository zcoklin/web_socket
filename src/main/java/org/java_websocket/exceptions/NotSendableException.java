package org.java_websocket.exceptions;

public class NotSendableException extends RuntimeException
{

    public NotSendableException()
    {
    }

    public NotSendableException(String message)
    {
        super(message);
    }

    public NotSendableException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public NotSendableException(Throwable cause)
    {
        super(cause);
    }

    /**
     * Serializable
     */
    private static final long serialVersionUID = -6468967874576651628L;

}
