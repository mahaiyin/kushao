package com.kushao.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kushao.dao.SysDao;
import com.kushao.entity.Sys;

@Service("sysService")
@Transactional
public class SysServiceImpl implements SysService {

	@Resource(name = "sysDao")
	private SysDao sysDao;

	public Sys find(int id) {
		return sysDao.findById(id);
	}

}
