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
		req.setAttribute("title", "酷少网");
		req.setAttribute("keywords", "酷少,kushao,kushao.com");
		req.setAttribute("description", "酷少网是一个我自己做的个人网站！");
		return "index";
	}
}
