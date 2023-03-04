package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Main class
public class DemoController {
	
	Logger logger = LoggerFactory.getLogger(DemoController.class);

 @RequestMapping("/hello1")
 @ResponseBody

 // Method
 public String helloGFG()
 {
	 logger.error("Logger Error");
	 logger.info("Logger Info");
	 logger.debug("Logger Debiger");
     return "Hello GeeksForGeeks";
 }
}