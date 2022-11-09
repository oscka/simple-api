package com.example.simpleapi.controller;
import java.util.ArrayList;
import java.util.List;

import com.example.simpleapi.model.Simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class SimpleApiController {
	@Value("${echo.log.level}")
	String echoLogLevel;

	@GetMapping("/hello")
	public String hello() throws Exception {
		log.info("==========simple-api home()");		
		return "hello world :"+echoLogLevel;
	}


	@GetMapping("/simple")
	public List<Simple> listSimple(){
		List<Simple> list = new ArrayList<>();
		
		for(int i=0 ; i< 10;i++) {
			list.add(new Simple(i+1,"test-"+i, "contents-"+i));
			log.info("for "+i);
		}
		log.info(list.toString());
		return list;
		
	}
	
	@GetMapping("/version")
	public String version(){
		//log.info("version 1.0");
		return "=====  version 1.0";
		
	}

}
