package com.example.formationbapp.entity;

import android.media.Image;

import org.w3c.dom.Text;

public class Newsletter {
    private int id;

    private String titre;

    private Image illustration;

    private Text news;

    private User user;

    public int getIdNl() {
        return id;
    }

    public void setIdNl(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Image getIllustration() {
        return illustration;
    }

    public void setIllustration(Image illustration) {
        this.illustration = illustration;
    }

    public Text getNews() {
        return news;
    }

    public void setNews(Text news) {
        this.news = news;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
