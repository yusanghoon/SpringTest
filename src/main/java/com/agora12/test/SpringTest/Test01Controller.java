package com.agora12.test.SpringTest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Spring/test")
public class Test01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String scoreRsponse() {
		return "<h1>테스트 프로젝트 완성</h1><h3>해당 프로젝트를 통해서 문제 풀이를 진행합니다</h3>";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Integer> mapResponse(){
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 95);
		scoreMap.put("영어", 85);
		return scoreMap;
		
	}
	
	
}
