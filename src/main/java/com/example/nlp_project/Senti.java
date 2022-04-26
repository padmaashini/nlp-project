package com.example.nlp_project;

public class Senti {
    private String text;
    private float score;
    private float magnitude;

    public Senti() {

    }

    public Senti(String text, float score, float magnitude) {
        super();
        this.text = text;
        this.score = score;
        this.magnitude = magnitude;
    }

    public void setSentiText(String text) {
        this.text = text;
    }

    public void setSentiScore(float score) {
        this.score = score;
    }

    public void setSentiMag(float magnitude) {
        this.magnitude = magnitude;
    }

    public String getSentiText() {
        return this.text;
    }

    public float getSentiScore() {
        return this.score;
    }

    public float getSentiMag() {
        return this.magnitude;
    }

}
