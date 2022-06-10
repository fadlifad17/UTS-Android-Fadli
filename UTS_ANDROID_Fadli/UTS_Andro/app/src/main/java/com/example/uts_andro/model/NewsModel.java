package com.example.uts_andro.model;

public class NewsModel {
    String imgNews;
    String txtTitle;
    String txtContent;

    public String getImage() { return imgNews; }

    public void setImage(String imgNews) {
        this.imgNews = imgNews;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtContent() {
        return txtContent;
    }

    public void setTxtContent(String txtContent) {
        this.txtContent = txtContent;
    }
}
