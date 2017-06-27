package com.kushao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kushao.service.SysService;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("sysService")
	private SysService sysService;

	@RequestMapping("/index.do")
	public String index(HttpServletRequest req) {
		System.out.println(sysService.find(1));
		req.setAttribute("title", "������");
		req.setAttribute("keywords", "����,kushao,kushao.com");
		req.setAttribute("description", "��������һ�����Լ����ĸ�����վ��");
		return "index";
	}
}
