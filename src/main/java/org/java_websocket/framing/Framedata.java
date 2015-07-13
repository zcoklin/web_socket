package org.java_websocket.framing;

import java.nio.ByteBuffer;

import org.java_websocket.exceptions.InvalidFrameException;

public interface Framedata
{
    public enum Opcode
    {
        BINARY, CLOSING, CONTINUOUS, PING, PONG, TEXT
        // more to come, CONTINUOUS, PING, PONG, TEXT
    }

    public abstract void append(Framedata nextframe) throws InvalidFrameException;

    public Opcode getOpcode();

    public ByteBuffer getPayloadData();// TODO the separation of the application
                                       // data and the extension data is yet to
                                       // be done

    public boolean getTransfereMasked();

    public boolean isFin();
}
