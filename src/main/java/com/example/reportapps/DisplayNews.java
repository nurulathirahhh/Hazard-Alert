package com.example.reportapps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DisplayNews {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * No args constructor for use in serialization
     *
     */
    public DisplayNews() {
    }

    /**
     *
     * @param date
     * @param title
     * @param content
     */
    public DisplayNews(String title, String content, String date) {
        super();
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}