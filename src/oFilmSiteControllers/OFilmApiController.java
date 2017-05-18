package oFilmSiteControllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import aplication.services.servicesImpl.Phim14ServicesImpl;
import model.Film;

@RestController
public class OFilmApiController {
	Phim14ServicesImpl sPhim14Services;
	@RequestMapping(value = "/getListFilm?url={url}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getListFilm(@PathVariable String url) {
		List<Film> sPhim14Services.getListFilm(url);
		
		String result = page;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
}
