package com.github.jxinx.mybatisgenerator.dao;

import com.github.jxinx.mybatisgenerator.entity.CameraType;

public interface CameraTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CameraType record);

    int insertSelective(CameraType record);

    CameraType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CameraType record);

    int updateByPrimaryKey(CameraType record);
}