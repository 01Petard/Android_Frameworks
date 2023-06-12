package com.ixuea.courses.helloworld.tabBar;

import java.util.Date;

public class News {
    private String title;
    private String content;
    private String writer;
    private String time;
    private int img;
    public News(){}
    public News(String title, String content,String writer, String time, int img){
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.time = time;
        this.img = img;
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



    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
