package com.example.sharedpref_sampletwo_android_github.Model;

public class DataItem {

    private String userId;
    private String profile_image;
    private String user_name;
    private String uploaded_book_image;
    private long numberOfLikes;
    private String user_name_description;
    private String book_name_description;

    public DataItem(String userId, String profile_image, String user_name, String uploaded_book_image, long numberOfLikes, String user_name_description, String book_name_description) {
        this.userId = userId;
        this.profile_image = profile_image;
        this.user_name = user_name;
        this.uploaded_book_image = uploaded_book_image;
        this.numberOfLikes = numberOfLikes;
        this.user_name_description = user_name_description;
        this.book_name_description = book_name_description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUploaded_book_image() {
        return uploaded_book_image;
    }

    public void setUploaded_book_image(String uploaded_book_image) {
        this.uploaded_book_image = uploaded_book_image;
    }

    public long getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(long numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public String getUser_name_description() {
        return user_name_description;
    }

    public void setUser_name_description(String user_name_description) {
        this.user_name_description = user_name_description;
    }

    public String getBook_name_description() {
        return book_name_description;
    }

    public void setBook_name_description(String book_name_description) {
        this.book_name_description = book_name_description;
    }
}
