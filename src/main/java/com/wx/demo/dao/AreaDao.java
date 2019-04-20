package com.wx.demo.dao;


import com.wx.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Cx On 2018/5/2 19:11
 */
public interface AreaDao {

    //查询所以区域
    List<Area> queryAllArea();

    //通过id查询对应的唯一的area
    Area queryAreaById(@Param("id") int id);

    //添加area
    int insertArea(@Param("area") Area area);

    //更新area信息
    int updateArea(@Param("area") Area area);

    //通过id来删除对应的Area
    int delAreaById(@Param("id") int id);

}
