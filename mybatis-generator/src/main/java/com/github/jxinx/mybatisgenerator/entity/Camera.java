package com.github.jxinx.mybatisgenerator.entity;

public class Camera {
    private Integer id;

    private String cameraSn;

    private Integer cameraTypeId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCameraSn() {
        return cameraSn;
    }

    public void setCameraSn(String cameraSn) {
        this.cameraSn = cameraSn == null ? null : cameraSn.trim();
    }

    public Integer getCameraTypeId() {
        return cameraTypeId;
    }

    public void setCameraTypeId(Integer cameraTypeId) {
        this.cameraTypeId = cameraTypeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}