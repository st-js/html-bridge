package org.stjs.javascript.websocket;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent
 * 
 * 
 * A MessageEvent is the interface representing a message received by a target,
 * being a WebSocket or a WebRTC RTCDataChannel
 * 
 * The action triggered by this event is set via an event handler set on
 * WebSocket.onmessage or RTCDataChannel.onmessage.
 * 
 */
@STJSBridge
public class MessageEvent extends DOMEvent {
    public String data;
    public String origin;
    public Object ports;
    public String source;

}
