package ofilmsite.controllers;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ofilmsite.common.FilmEnum;
import ofilmsite.common.Utility;
import ofilmsite.model.ApiResult;
import ofilmsite.model.Film;
import ofilmsite.model.FilmDetail;
import ofilmsite.services.iservices.IPhimServices;

@RestController
public class OFilmApiController {
	// /Film services
	@Autowired
	IPhimServices sPhim14Services;

	// get list Film on the site
	@RequestMapping(value = "/getListFilm", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody String getListFilm(
			@RequestParam(value = "url", required = true) String url,
			@RequestParam(value = "name", required = true) String name) {
		ApiResult apiResult = new ApiResult();
		try {
			@SuppressWarnings("deprecation")
			String url_Decode = URLDecoder.decode(url);
			@SuppressWarnings("deprecation")
			String name_Decode = URLDecoder.decode(name);
			List<Film> lstFilm = new ArrayList<Film>();
			switch (FilmEnum.valueOf(name_Decode.toUpperCase())) {
			case PHIM14:
				lstFilm = sPhim14Services.getListFilm(url_Decode);
				break;
			default:
				break;
			}
			apiResult.setData(lstFilm);
		} catch (Exception e) {
			apiResult.setIsSuccess(false);
			apiResult.setMessage(e.toString());
		}
		return Utility.ConvertToJson(apiResult);
	}

	// get film detail info
	@RequestMapping(value = "/getFilmDetail", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody String getFilmDetail(
			@RequestParam(value = "url", required = true) String url,
			@RequestParam(value = "name", required = true) String name) {
		ApiResult apiResult = new ApiResult();
		try {
			@SuppressWarnings("deprecation")
			String url_Decode = URLDecoder.decode(url);
			@SuppressWarnings("deprecation")
			String name_Decode = URLDecoder.decode(name);
			FilmDetail oFilmDetail = new FilmDetail();
			switch (FilmEnum.valueOf(name_Decode.toUpperCase())) {
			case PHIM14:
				oFilmDetail = sPhim14Services.getFilmDetail(url_Decode);
				break;
			default:
				break;
			}
			apiResult.setData(oFilmDetail);
		} catch (Exception e) {
			apiResult.setIsSuccess(false);
			apiResult.setMessage(e.toString());
		}
		return Utility.ConvertToJson(apiResult);
	}

	// get link film to watch
	@RequestMapping(value = "/getWatchFilmUrl", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResponseEntity<ApiResult> getWatchUrl(
			@RequestParam(value = "url", required = true) String url,
			@RequestParam(value = "name", required = true) String name) {
		ApiResult apiResult = new ApiResult();
		try {
			@SuppressWarnings("deprecation")
			String url_Decode = URLDecoder.decode(url);
			@SuppressWarnings("deprecation")
			String name_Decode = URLDecoder.decode(name);
			String sWatchUrl = "";
			switch (FilmEnum.valueOf(name_Decode.toUpperCase())) {
			case PHIM14:
				sWatchUrl = sPhim14Services.getWatchFilmUrl(url_Decode);
				break;
			default:
				break;
			}
			apiResult.setData(sWatchUrl);
		} catch (Exception e) {
			apiResult.setIsSuccess(false);
			apiResult.setMessage(e.toString());
		}
		return new ResponseEntity<ApiResult>(apiResult, HttpStatus.OK);
	}
}
