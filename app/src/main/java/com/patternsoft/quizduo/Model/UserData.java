package com.patternsoft.quizduo.Model;

public class UserData {

    private String username;
    private String password;
    private String email;
    private double score;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserData(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
