package com.agora12.test.SpringTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Spring/test")
public class Test02Controller {

	
	@RequestMapping("/3")
	public Map<String, String> mapResponse() {
		Map<String,String> movieMap = new HashMap<>();
			movieMap.put("rate :", "15");
			movieMap.put("director", "봉준호");
			movieMap.put("time :", "131");
			movieMap.put("title :", "기생충");
			
			List<Map<String, String>> movieMaps = new ArrayList<>();
			Map<String, String> movieMap1 = new HashMap<>();
			movieMap1.put("rate :", "0");
			movieMap1.put("director", "로베르토 베니니");
			movieMap1.put("time :", "116");
			movieMap1.put("title :", "인생은 아름다워");
			
			
			
			return movieMap;
		
	}
	
}
