package oFilmSiteControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import common.Utility;
import aplication.services.iservices.IPhim14Services;
import aplication.services.servicesImpl.Phim14ServicesImpl;
import model.ApiResult;
import model.Film;

@RestController
public class OFilmApiController {
	
	@Autowired
	Phim14ServicesImpl sPhim14Services =new Phim14ServicesImpl();
	@RequestMapping(value = "/getListFilm/url={url}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getListFilm(@PathVariable String url) {
		ApiResult apiResult = new ApiResult();
		try {
			List<Film> lstFilm = sPhim14Services.getListFilm("http://phim14.net/");
			apiResult.setData(lstFilm);
			
		} catch (Exception e) {
			apiResult.setIsSuccess(false);
			apiResult.setMessage(e.toString());
		}
		return Utility.ConvertToJson(apiResult);
	}
}
