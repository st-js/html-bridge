package org.stjs.javascript.websocket;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.file.Blob;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.typed.ArrayBuffer;

@STJSBridge
/** https://developer.mozilla.org/en-US/docs/Web/API/WebSocket */
public class WebSocket {
    /** The connection is not yet open. */
    public final static int CONNECTING = 0;
    /** The connection is open and ready to communicate. */
    public final static int OPEN = 1;
    /** The connection is in the process of closing. */
    public final static int CLOSING = 2;
    /** The connection is closed or couldn't be opened. */
    public final static int CLOSED = 3;

    /**
     * The constructor can throw exceptions:
     * 
     * 
     * @param url
     *            The URL to which to connect; this should be the URL to which
     *            the WebSocket server will respond.
     * 
     * @param protocols
     *            Either a single protocol string or an array of protocol
     *            strings. These strings are used to indicate sub-protocols, so
     *            that a single server can implement multiple WebSocket
     *            sub-protocols (for example, you might want one server to be
     *            able to handle different types of interactions depending on
     *            the specified protocol). If you don't specify a protocol
     *            string, an empty string is assumed.
     * 
     * @throws SECURITY_ERR
     *             The port to which the connection is being attempted is being
     *             blocked.
     * 
     */
    public WebSocket(String url, String... protocols) {
    }

    /**
     * A string indicating the type of binary data being transmitted by the
     * connection. This should be either "blob" if DOM Blob objects are being
     * used or "arraybuffer" if ArrayBuffer objects are being used.
     */
    public String binaryType;
    /**
     * The number of bytes of data that have been queued using calls to send()
     * but not yet transmitted to the network. This value does not reset to zero
     * when the connection is closed; if you keep calling send(), this will
     * continue to climb. Read only
     */
    public long bufferedAmount;
    /**
     * The extensions selected by the server. This is currently only the empty
     * string or a list of extensions as negotiated by the connection.
     */
    public String extensions;
    /**
     * An event listener to be called when the WebSocket connection's readyState
     * changes to CLOSED. The listener receives a CloseEvent named "close".
     */
    public Callback1<CloseEvent> onclose;
    /**
     * An event listener to be called when an error occurs. This is a simple
     * event named "error".
     */
    public Callback1<DOMEvent> onerror;
    /**
     * An event listener to be called when a message is received from the
     * server. The listener receives a MessageEvent named "message".
     */
    public Callback1<MessageEvent> onmessage;
    /**
     * An event listener to be called when the WebSocket connection's readyState
     * changes to OPEN; this indicates that the connection is ready to send and
     * receive data. The event is a simple one with the name "open".
     */
    public Callback1<DOMEvent> onopen;
    /**
     * A string indicating the name of the sub-protocol the server selected;
     * this will be one of the strings specified in the protocols parameter when
     * creating the WebSocket object.
     */
    public String protocol;
    /**
     * The current state of the connection; this is one of the Ready state
     * constants. Read only.
     */
    public int readyState;
    /**
     * The URL as resolved by the constructor. This is always an absolute URL.
     * Read only.
     */
    public String url;

    /**
     * 
     * Exceptions thrown
     * 
     * 
     * @param code
     *            A numeric value indicating the status code explaining why the
     *            connection is being closed. If this parameter is not
     *            specified, a default value of 1000 (indicating a normal
     *            "transaction complete" closure) is assumed. See the list of
     *            status codes on the CloseEvent page for permitted values.
     * 
     * @param reason
     *            A human-readable string explaining why the connection is
     *            closing. This string must be no longer than 123 bytes of UTF-8
     *            text (not characters).
     * 
     * @throws INVALID_ACCESS_ERR
     *             An invalid code was specified.
     * 
     * @throws SYNTAX_ERR
     *             The reason string is too long or contains unpaired
     *             surrogates.
     * 
     */
    @Native
    public void close(int code, String reason) {
    }

    /**
     * Transmits data to the server over the WebSocket connection.
     * 
     * 
     * 
     * @param data
     *            A text string to send to the server.
     * @throws INVALID_STATE_ERR
     *             The connection is not currently OPEN. SYNTAX_ERR The data is
     *             a string that has unpaired surrogates.
     * 
     */
    @Native
    public void send(String data) {
    }

    @Native
    public void send(ArrayBuffer data) {
    }

    @Native
    public void send(Blob data) {
    }

}
