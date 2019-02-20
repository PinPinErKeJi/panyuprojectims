package com.panyu.panyuprojectims;

import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.entity.PowerSupplyModule;
import com.panyu.panyuprojectims.poi.ExportExcel;
import com.panyu.panyuprojectims.service.*;
import com.panyu.panyuprojectims.utils.RedisTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PanyuprojectimsApplicationTests {
//	@Autowired
//	private PowerSupplyInformationService powerSupplyInformationService;
	@Autowired
	private PanyuUserDao panyuUserDao;
	@Autowired
	RedisTemplate re;
	@Test
	public void contextLoads() {
		//操作string类型字符
		/*ValueOperations<String, String> valueStr = re.opsForValue();
		valueStr.set("kk","我恨你");

		String goodsname = valueStr.get("kk");
		System.out.println(goodsname);*/
		PanyuUser panyuUser = panyuUserDao.selectPanyuUserByName("李四");
		System.out.println("用户:"+panyuUser);
	}
}
