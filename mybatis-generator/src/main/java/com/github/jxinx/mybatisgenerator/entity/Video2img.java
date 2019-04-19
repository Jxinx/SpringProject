package com.github.jxinx.mybatisgenerator.entity;

public class Video2img {
    private Integer id;

    private String name;

    private Integer second;

    private Integer frame;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getFrame() {
        return frame;
    }

    public void setFrame(Integer frame) {
        this.frame = frame;
    }
}