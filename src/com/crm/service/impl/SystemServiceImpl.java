package com.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.BaseDictDao;
import com.crm.pojo.BaseDict;
import com.crm.service.SystemService;

/**
 * 基础信息数据字典
 * 
 * @author lx
 *
 */

@Service("systemService")
public class SystemServiceImpl implements SystemService {

	@Autowired
	private BaseDictDao baseDictDao;

	// 根据类型编号查询数据字典
	public List<BaseDict> findBaseDictListByType(String typecode) {
		return baseDictDao.selectByTypecode(typecode);
	}

}
