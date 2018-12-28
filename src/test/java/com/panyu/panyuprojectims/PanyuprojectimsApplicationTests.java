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

@RunWith(SpringRunner.class)
@SpringBootTest
public class PanyuprojectimsApplicationTests {
	@Autowired
	private PowerSupplyInformationService powerSupplyInformationService;
	@Autowired
	private PowerSupplyModuleDao powerSupplyModuleDao;
	@Test
	public void contextLoads() {
		String s = "2";
		int i31 = s.indexOf(".");
		if(i31>0){
			s = s.substring(0, i31);
			System.out.println("s:"+s);
		}else {
			s = s.substring(0);
			System.out.println("s:"+s);
		}
	}
}
