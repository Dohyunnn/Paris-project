package com.pdh.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrArticleController {
	@RequestMapping("usr/home/main") 
		@ResponseBody
		public String showMain() {
			return "안녕하세요 반가워요";
		}
	} 
