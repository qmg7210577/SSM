package com.yanjie.test.util;

/**
 * Created by Administrator on 2017/8/23.
 */
public class Message {
    private MessageState state;
    private String message;
    private Object context;
    public Message(MessageState state, String message, Object context) {
        this.state = state;
        this.message = message;
        this.context = context;
    }

    public MessageState getState() {
        return state;
    }

    public void setState(MessageState state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }
}
