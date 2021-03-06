package com.theironyard;


import javax.persistence.*;


@Entity
@Table (name= "messages")
public class Message {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String text;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Message(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}