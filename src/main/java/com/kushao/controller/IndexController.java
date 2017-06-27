package com.kushao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String index(HttpServletRequest req) {
		req.setAttribute("title", "������");
		req.setAttribute("keywords", "����,kushao,kushao.com");
		req.setAttribute("description", "��������һ�����Լ����ĸ�����վ��");
		return "index";
	}
}
