package mvc_demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyClass {
	@RequestMapping("/hello")
	@ResponseBody
	String hello() {
		return "Hello";
	}
	@RequestMapping("/hii")
	@ResponseBody
	String hii() {
		return "Hiiiiiiii";
	}
	@RequestMapping("/Bye")
	@ResponseBody
	String Bye() {
		return "byee";
	}
	@RequestMapping("/otp")
	@ResponseBody
	String otp() {
		return "The Otp is :"+ new Random().nextInt(1000,10000);
	}
	
}
