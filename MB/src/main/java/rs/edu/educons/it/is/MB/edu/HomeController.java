package rs.edu.educons.it.is.MB.edu;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

	@RequestMapping("/")
	public String index() {

		return "index.html";
	}

}
