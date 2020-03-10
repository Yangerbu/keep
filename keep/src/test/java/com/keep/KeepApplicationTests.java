package com.keep;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.keep.mapper.UserInfoMapper;
import com.keep.pojo.UserInfo;

@SpringBootTest
class KeepApplicationTests {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Test
	void contextLoads() {
		//select * from tb_user_info limit 0,6
		IPage<UserInfo> ipage=new Page<UserInfo>(0,5);
		IPage<UserInfo> selectPage = userInfoMapper.selectPage(ipage,null);
		System.out.println(selectPage.getTotal());
		List<UserInfo> records = selectPage.getRecords();
		for (UserInfo userInfo : records) {
			System.out.println(userInfo);
		}
	}

}
