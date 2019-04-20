package com.wx.demo;

import com.wx.demo.entity.Area;
import com.wx.demo.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	AreaService areaService;

	@Test
	public void contextLoads() {

		Area a = new Area();
		a.setAreaId(3);
		a.setAreaName("湖北");
		a.setPriority(3);
		//a.setCreateTime(new Date());
		//a.setCreateTime(new Date());
		areaService.updateArea(a);

	}

}
