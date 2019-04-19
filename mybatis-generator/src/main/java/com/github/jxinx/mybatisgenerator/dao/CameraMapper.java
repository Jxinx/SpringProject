package com.github.jxinx.mybatisgenerator.dao;

import com.github.jxinx.mybatisgenerator.entity.Camera;

public interface CameraMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Camera record);

    int insertSelective(Camera record);

    Camera selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Camera record);

    int updateByPrimaryKey(Camera record);
}