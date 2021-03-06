package com.simin.siru.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simin.siru.model.domain.Member;
import com.simin.siru.model.domain.ResponseData;
import com.simin.siru.model.service.MemberService;

@RestController
public class MyController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/my/information/get", method = RequestMethod.GET, produces = "application/text;charset=utf8")
	public String getInformation(int member_id) {
		Member member = memberService.get(member_id);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(member);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return jsonString;
	}
	
	@RequestMapping(value = "/my/information/change", method = RequestMethod.POST, produces = "application/text;charset=utf8")
	public String changeInformation(Member member) {
		ResponseData responseData = memberService.changeInformation(member);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(responseData);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return jsonString;
	}

}
