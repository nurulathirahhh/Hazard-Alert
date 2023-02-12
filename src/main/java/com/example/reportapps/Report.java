package com.example.reportapps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Report {

    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("reporter")
    @Expose
    private String reporter;

    /**
     * No args constructor for use in serialization
     *
     */
    public Report() {
    }

    /**
     *
     * @param latitude
     * @param description
     * @param location
     * @param reporter
     * @param longitude
     */
    public Report(String location, String description, String latitude, String longitude, String reporter) {
        super();
        this.location = location;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.reporter = reporter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

}