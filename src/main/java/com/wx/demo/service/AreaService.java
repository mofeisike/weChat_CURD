package com.wx.demo.service;

import com.wx.demo.entity.Area;

import java.util.List;

/**
 * @author mofeiske
 * @Description: ${todo}
 * @Date: Create in 2019/4/19 18:06
 */
public interface AreaService {

    //通过id查询Area
    List<Area> queryAll();

    //通过传入的area更新Area
    Area queryAeraById(int id);

     //通过传入的area更新Area
    Area updateArea(Area area);

    //通过Id删除Area
    boolean delAreaById(int id);

    //创建Area
    boolean addArea(Area area);

}
