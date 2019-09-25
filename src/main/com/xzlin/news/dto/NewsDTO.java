package com.xzlin.news.dto;

public class NewsDTO {
    String liveInfo;
    String docid;
    String source;
    String title;
    String priority;
    String hasImg;
    String url;
    String commentCount;
    String imgsrc3gtype;
    String stitle;
    String digest;
    String imgsrc;
    String ptime;

    public String getLiveInfo() {
        return liveInfo;
    }

    public void setLiveInfo(String liveInfo) {
        this.liveInfo = liveInfo;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getHasImg() {
        return hasImg;
    }

    public void setHasImg(String hasImg) {
        this.hasImg = hasImg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getImgsrc3gtype() {
        return imgsrc3gtype;
    }

    public void setImgsrc3gtype(String imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
    }

    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public NewsDTO() {
    }

    public NewsDTO(String liveInfo, String docid, String source, String title, String priority, String hasImg, String url, String commentCount, String imgsrc3gtype, String stitle, String digest, String imgsrc, String ptime) {
        this.liveInfo = liveInfo;
        this.docid = docid;
        this.source = source;
        this.title = title;
        this.priority = priority;
        this.hasImg = hasImg;
        this.url = url;
        this.commentCount = commentCount;
        this.imgsrc3gtype = imgsrc3gtype;
        this.stitle = stitle;
        this.digest = digest;
        this.imgsrc = imgsrc;
        this.ptime = ptime;
    }

    @Override
    public String toString() {
        return "NewsDTO{" +
                "liveInfo='" + liveInfo + '\'' +
                ", docid='" + docid + '\'' +
                ", source='" + source + '\'' +
                ", title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", hasImg='" + hasImg + '\'' +
                ", url='" + url + '\'' +
                ", commentCount='" + commentCount + '\'' +
                ", imgsrc3gtype='" + imgsrc3gtype + '\'' +
                ", stitle='" + stitle + '\'' +
                ", digest='" + digest + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", ptime='" + ptime + '\'' +
                '}'+"\n\t";
    }
}
