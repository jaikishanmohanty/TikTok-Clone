package com.example.tiktokclone;

public class Model {
    String videoURL;
    int profile;
    String name;

    public Model(String videoURL, int profile, String name) {
        this.videoURL = videoURL;
        this.profile = profile;
        this.name = name;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
