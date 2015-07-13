package org.java_websocket.exceptions;

import org.java_websocket.framing.CloseFrame;

public class LimitExedeedException extends InvalidDataException
{

    public LimitExedeedException()
    {
        super(CloseFrame.TOOBIG);
    }

    public LimitExedeedException(String s)
    {
        super(CloseFrame.TOOBIG, s);
    }

    /**
     * Serializable
     */
    private static final long serialVersionUID = 6908339749836826785L;

}
