package com.keep.service;

import java.util.List;

import com.keep.pojo.UserInfo;
import com.kepp.vo.InfoVo;

public interface UserInfoService {

	InfoVo findUserInfoTable(Integer currentPage,Integer rows);

	void updateUser(UserInfo user);

	void deleteUser(Integer id);


}
