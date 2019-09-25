package com.xzlin.news.entity;

import java.sql.Timestamp;

public class News {
  int id;
  String  label;
  String url;
 int degree;
 int isNice;
 int isShow;
String ftime;
 Timestamp ctime;
 String discribe;
 String title;
 String imgUrl;

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getIsNice() {
        return isNice;
    }

    public void setIsNice(int isNice) {
        this.isNice = isNice;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public News(int id, String label, String url, int degree, int isNice, int isShow, Timestamp  ctime, String discribe, String title, String imgUrl) {
        this.id = id;
        this.label = label;
        this.url = url;
        this.degree = degree;
        this.isNice = isNice;
        this.isShow = isShow;
        this.ctime = ctime;
        this.discribe = discribe;
        this.title = title;
        this.imgUrl = imgUrl;
    }

    public Timestamp  getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp  ctime) {
        this.ctime = ctime;
    }

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", url='" + url + '\'' +
                ", degree=" + degree +
                ", isNice=" + isNice +
                ", isShow=" + isShow +
                ", ctime='" + ctime + '\'' +
                ", discribe='" + discribe + '\'' +
                ", title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
