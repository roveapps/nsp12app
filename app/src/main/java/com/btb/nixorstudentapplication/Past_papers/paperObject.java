package com.btb.nixorstudentapplication.Past_papers;

public class paperObject {
    String month,year,variant,type, documentID;
    float rating;

    public float getRating() {
        return rating;
    }

    public paperObject setRating(Float rating) {
        this.rating = rating;
        return this;
    }

    public String getDocumentID() {
        return documentID;
    }

    public paperObject setDocumentID(String documentID) {
        this.documentID = documentID;
        return this;
    }

    public paperObject(String month, String year, String variant, String type, String documentID, Float rating) {
        this.month = month;
        this.year = year;
        this.variant = variant;
        this.type = type;
        this.documentID = documentID;
        this.rating = rating;
    }

    public paperObject() {
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
