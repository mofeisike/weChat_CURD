package com.wx.demo.controller;

import com.wx.demo.entity.Area;
import com.wx.demo.service.AreaService;
import com.wx.demo.util.FormatResponseUtil;
import com.wx.demo.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping("/areaList")
    public ResponseResult ququeryAll(){
        return FormatResponseUtil.formatResponse(areaService.queryAll());

    }

    @GetMapping("/one")
    public ResponseResult querybyId(int id){
        return FormatResponseUtil.formatResponse(areaService.queryAeraById(id));
    }

    @PostMapping()
    public ResponseResult addArea(@RequestBody Area area){
        System.out.println(area);
        return FormatResponseUtil.formatResponse(areaService.addArea(area));
    }

    @PostMapping("/delete")
    public ResponseResult delAreaById (int id){
        return FormatResponseUtil.formatResponse(areaService.delAreaById(id));
    }

    @PostMapping("/areainfo")
    public ResponseResult updateArea(@RequestBody Area area){

        return FormatResponseUtil.formatResponse(areaService.updateArea(area));
    }


}
