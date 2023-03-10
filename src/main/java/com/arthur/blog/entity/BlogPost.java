package com.arthur.blog.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "blog-posts")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "blog")
    private String blog;

    public BlogPost() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        String res;
        if (image == null) {
            res = "BlogPost{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", date=" + date +
                    ", blog='" + blog + '\'' +
                    '}';
        } else {
            res = "BlogPost{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", date=" + date +
                    ", image=" + Arrays.toString(Arrays.copyOfRange(image, 0, 5)) +
                    ", blog='" + blog + '\'' +
                    '}';
        }
        return res;
    }
}
