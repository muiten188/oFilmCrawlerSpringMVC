package ofilmsite.controllers;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ofilmsite.common.Utility;
import ofilmsite.model.ApiResult;
import ofilmsite.model.Film;
import ofilmsite.services.iservices.IPhimServices;
@RestController
public class OFilmApiController {

	@Autowired
	IPhimServices sPhim14Services;
	@RequestMapping(value = "/getListFilm", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getListFilm(@RequestParam("url") String url) {
		ApiResult apiResult = new ApiResult();
		try {
			@SuppressWarnings("deprecation")
			String url_Decode = URLDecoder.decode(url);
			List<Film> lstFilm = sPhim14Services.getListFilm(url_Decode);
			apiResult.setData(lstFilm);
		} catch (Exception e) {
			apiResult.setIsSuccess(false);
			apiResult.setMessage(e.toString());
		}
		return Utility.ConvertToJson(apiResult);
	}
}
