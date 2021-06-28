package jp.ac.hcs.S3A323.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalContoroller {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}

