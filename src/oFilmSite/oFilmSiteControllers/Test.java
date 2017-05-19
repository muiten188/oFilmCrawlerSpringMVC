package oFilmSite.oFilmSiteControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public @ResponseBody String getApi(){
		return "api ok";
	}
}
