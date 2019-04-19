package com.github.jxinx.mybatisgenerator.dao;

import com.github.jxinx.mybatisgenerator.entity.Img;

public interface ImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}