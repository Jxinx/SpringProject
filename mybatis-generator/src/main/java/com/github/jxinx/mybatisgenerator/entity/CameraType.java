package com.github.jxinx.mybatisgenerator.entity;

public class CameraType {
    private Integer id;

    private String brandName;

    private String cameraTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getCameraTypeName() {
        return cameraTypeName;
    }

    public void setCameraTypeName(String cameraTypeName) {
        this.cameraTypeName = cameraTypeName == null ? null : cameraTypeName.trim();
    }
}