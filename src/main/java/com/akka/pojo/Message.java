/**
 * Immutable message class;
 */

package com.akka.pojo;

public class Message {
    public final String from;
    public final String to;
    public final String data;

    public Message(String from, String to, String data) {
        this.from = from;
        this.to = to;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String getTo() {
        return to;
    }

    public String getData() {
        return data;
    }

    public String getFrom() {
        return from;
    }
}
