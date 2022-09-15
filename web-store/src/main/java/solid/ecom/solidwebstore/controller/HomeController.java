package solid.ecom.solidwebstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("hello", "Chao mung solid ecommerce Home page!");
		model.addAttribute("tagline", "Website ecommerce tot nhat hien nay");
		return "forward:/welcome/greeting";
		// return "redirect:/welcome/greeting";
	}

	@RequestMapping("/welcome/greeting")
	public String greeting() {
		return "welcome";
	}
}
