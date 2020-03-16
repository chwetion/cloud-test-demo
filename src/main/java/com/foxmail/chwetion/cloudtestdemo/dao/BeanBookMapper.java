package com.foxmail.chwetion.cloudtestdemo.dao;

import com.foxmail.chwetion.cloudtestdemo.bean.BeanBook;
import com.foxmail.chwetion.cloudtestdemo.bean.BeanBookExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BeanBookMapper {
    long countByExample(BeanBookExample example);

    int deleteByExample(BeanBookExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(BeanBook record);

    int insertSelective(BeanBook record);

    List<BeanBook> selectByExample(BeanBookExample example);

    BeanBook selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") BeanBook record, @Param("example") BeanBookExample example);

    int updateByExample(@Param("record") BeanBook record, @Param("example") BeanBookExample example);

    int updateByPrimaryKeySelective(BeanBook record);

    int updateByPrimaryKey(BeanBook record);
}