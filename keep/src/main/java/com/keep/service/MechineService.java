package com.keep.service;

import com.keep.pojo.Material;
import com.kepp.vo.InfoVo;

public interface MechineService {

	InfoVo getMechineTableIndo(Integer page, Integer limit);

	void mechineUpdate(Material material);

	void mechineDelete(Integer id);

}
