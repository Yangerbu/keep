package com.keep.service;

import com.keep.pojo.Classes;
import com.kepp.vo.InfoVo;

public interface ClassesService {

	InfoVo getClassesTableInfo(Integer page, Integer limit);

	void classesUpdate(Classes classes);

	void classesDelete(Integer id);

}
