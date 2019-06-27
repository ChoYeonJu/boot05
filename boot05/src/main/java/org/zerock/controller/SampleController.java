package org.zerock.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.domain.MemberVO;

@Controller
public class SampleController {

	@GetMapping("/sample1")
	public void sample1(Model model) {
		
		model.addAttribute("greeting", "hello world");		//value 객체를 name 이름으로 추가 
		model.addAttribute("greeting","안녕하세요.");
	}
	
	@GetMapping("/sample2") 
		public void sample2(Model model) {
			
			MemberVO vo = new MemberVO(123, "whdus25", "*****", "연쥬", new Timestamp(System.currentTimeMillis()));
			
			model.addAttribute("vo", vo);
		
	}
	
	@GetMapping("/sample3")
	public void sample3(Model model) {
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			
			list.add(new MemberVO(123, "whdus256"+i, "****" + i, "조연쥬쥬" + i, new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/sample4")
	public void sample4(Model model) {
		
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 0; i<10; i++) {
			
			list.add(new MemberVO(i, "whdus25" + i%3, "***" + i%3, "연주짱" + i, new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/sample5")
	public void sample5(Model model) {
		
		String result = "SUCCESS";
		
		model.addAttribute("result", result);
	}
	
	@GetMapping("sample6")
	public void sample6(Model model) {
		
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			
			list.add(new MemberVO(i, "whdus25" + i, "ddd" + i, "연쥬ㅠ" + i, new Timestamp(System.currentTimeMillis())));
		}
		
		model.addAttribute("list", list);
		
		String result = "SUCCESS";
		
		model.addAttribute("result", result);
	}
	
	@GetMapping("/sample/hello")
	public void hello() {
		
	}
	
	@GetMapping("/sample8")
	public void sample8(){
		
	}

}
