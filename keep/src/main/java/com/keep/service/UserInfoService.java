package com.keep.service;

import java.util.List;

import com.keep.pojo.UserInfo;
import com.kepp.vo.UserInfoVo;

public interface UserInfoService {

	UserInfoVo findUserInfoTable(Integer currentPage,Integer rows);


}
