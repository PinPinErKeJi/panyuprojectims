package com.panyu.panyuprojectims;

import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.PowerSupplyModule;
import com.panyu.panyuprojectims.poi.ExportExcel;
import com.panyu.panyuprojectims.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PanyuprojectimsApplicationTests {
	@Autowired
	private PowerSupplyInformationService powerSupplyInformationService;

	@Test
	public void contextLoads() {

		/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		String d=sdf.format(new java.util.Date());
		String nian = d+"年";
		System.out.println(nian);
		SimpleDateFormat sdf1=new SimpleDateFormat("MM");
		String d1=sdf1.format(new java.util.Date());
		String yue = d1+"月";
		System.out.println(yue);
		SimpleDateFormat sdf2=new SimpleDateFormat("dd");
		String d2=sdf2.format(new java.util.Date());
		String ri = d2+"日";
		System.out.println(ri);
		SimpleDateFormat sdf3=new SimpleDateFormat(" HH:mm:ss");
		String d3=sdf3.format(new java.util.Date());
		System.out.println(d3);
		File file = new File("E:\\nian\\yue\\ri\\d3");
		System.out.println(file);*/
	}
}
