package oFilmSite.oFilmSiteControllers;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import oFilmSite.common.Utility;
import oFilmSite.model.ApiResult;
import oFilmSite.model.Film;
import oFilmSite.services.iservices.IPhim14Services;
import oFilmSite.services.servicesImpl.Phim14ServicesImpl;

@RestController
public class OFilmApiController {

	@Autowired
	IPhim14Services sPhim14Services;

	@RequestMapping(value = "/getListFilm/url={url}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getListFilm(@PathVariable String url) {
		String url_Decode = URLDecoder.decode(url);
		ApiResult apiResult = new ApiResult();
		try {
			List<Film> lstFilm = sPhim14Services.getListFilm(url_Decode);
			apiResult.setData(lstFilm);
		} catch (Exception e) {
			apiResult.setIsSuccess(false);
			apiResult.setMessage(e.toString());
		}
		return Utility.ConvertToJson(apiResult);
	}
}
