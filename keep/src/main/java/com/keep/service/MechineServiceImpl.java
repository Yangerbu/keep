package com.keep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.keep.mapper.MechineMapper;
import com.keep.pojo.Material;
import com.kepp.vo.InfoVo;

@Service
public class MechineServiceImpl implements MechineService {
	
	@Autowired
	private MechineMapper mechineMapper;

	@Override
	public InfoVo getMechineTableIndo(Integer page, Integer limit) {
		IPage<Material> ipage=new Page(page, limit);
		QueryWrapper<Material> queryWrapper=new QueryWrapper<>();
		queryWrapper.orderByDesc("in_time");
		IPage<Material> selectPage = mechineMapper.selectPage(ipage, null);
		return new InfoVo(selectPage.getTotal(),selectPage.getRecords());
	}
}
