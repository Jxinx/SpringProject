package com.github.jxinx.mybatisgenerator.dao;

import com.github.jxinx.mybatisgenerator.entity.Video2img;

public interface Video2imgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Video2img record);

    int insertSelective(Video2img record);

    Video2img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video2img record);

    int updateByPrimaryKey(Video2img record);
}