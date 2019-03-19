package com.example.diu.myaudio;

public class BanglaItem {

    private String storyName;
    private String writterName;
    private String storyImage;
    private String storyLink;


    public BanglaItem(String storyName, String writterName, String storyImage, String storyLink) {
        this.storyName = storyName;
        this.writterName = writterName;
        this.storyImage = storyImage;
        this.storyLink = storyLink;

    }

    //getter


    public String getStoryName() {

        return storyName;
    }

    public String getWritterName() {

        return writterName;
    }

    public String getStoryImage() {
        return storyImage;
    }

    public String getStoryLink() {
        return storyLink;
    }
    //setter


//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setStoryName(String storyName) {
//        this.storyName = storyName;
//    }
//
//    public void setWritterName(String writterName) {
//        this.writterName = writterName;
//    }
//
//    public void setCategoryId(Integer categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public void setStoryLink(String storyLink) {
//        this.storyLink = storyLink;
//    }
//
//    public void setStoryImage(String storyImage) {
//        this.storyImage = storyImage;
//    }
}
