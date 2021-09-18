package com.example.foodappex1.Domain;

public class LunchDomain {
    private String title;
    private int pic;

    public LunchDomain() {
    }

    public LunchDomain(String title, int pic) {
        this.title = title;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
