package eu.centric;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class UploadController extends WebMvcConfigurerAdapter {
	
	@GetMapping("/")
	public  String mainPage(Model model) {
		System.out.println("Method - mainPage");
		return "mypage.html";
	}
		 
	@GetMapping("/upload")
	public String uploadPage(Model model) {
		System.out.println("Method - upload");
		return "myupload";
	}
//	@Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//       // registry.addViewController("/mypage").setViewName("mypage");
//        registry.addViewController("/").setViewName("mypage");
//	}
	
	/*
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/").setViewName("mypage");
	        registry.addViewController("/mypage").setViewName("mypage");
	    }
*/
}
