package com.neo.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

	int TLCNum = 666;
	String json = "{'CSID': 1,'TLC':666,'TYH':8,'TZYH':13883,'TCS':40,'TYL':45,'TLL':36}";

    @RequestMapping("/hello")
	public String hello(Locale locale, Model model) {
		TLCNum--;
		json = "" + TLCNum;
    	return json;
	}


}