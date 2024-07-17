package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Note {

    @Id
    Long id;
    Date date;
    String text;
    String learning;
    String gratitute;
    String category;
    @ManyToOne
    User user;

    public Note() {}

    public Note(Long id, Date date, String text, String learning, String gratitute, String category, User user) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.learning = learning;
        this.gratitute = gratitute;
        this.category = category;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLearning() {
        return learning;
    }

    public void setLearning(String learning) {
        this.learning = learning;
    }

    public String getGratitute() {
        return gratitute;
    }

    public void setGratitute(String gratitute) {
        this.gratitute = gratitute;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
