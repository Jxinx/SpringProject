package com.github.jxinx.mybatisgenerator.dao;

import com.github.jxinx.mybatisgenerator.entity.Video;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}