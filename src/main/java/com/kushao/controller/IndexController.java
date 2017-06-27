package com.kushao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String index(HttpServletRequest req) {
		req.setAttribute("title", "酷少网");
		req.setAttribute("keywords", "酷少,kushao,kushao.com");
		req.setAttribute("description", "酷少网是一个我自己做的个人网站！");
		return "index";
	}
}
