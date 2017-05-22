package ofilmsite.services.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import ofilmsite.common.Curl;
import ofilmsite.common.HandlerException;
import ofilmsite.common.page_config.Phim14;
import ofilmsite.model.Episode;
import ofilmsite.model.Film;
import ofilmsite.model.FilmDetail;
import ofilmsite.model.ServerFilm;
import ofilmsite.services.iservices.IPhimServices;

@Service
public class Phim14ServicesImpl implements IPhimServices {

	public List<Film> getListFilm(String url) throws Exception {
		List<Film> listFilm = new ArrayList<>();
		try {
			Document docFilm = Jsoup.connect(url).get();
			Elements eListFilm = docFilm.select(Phim14.LIST_FILM);
			for (Element element : eListFilm) {
				Film oFilm = new Film();
				oFilm.setName1(element.select(Phim14.NAME1).text());
				oFilm.setName2(element.select(Phim14.NAME2).text());
				oFilm.setStatus(element.select(Phim14.STATUS).text());
				oFilm.setPosterUrl(element.select(Phim14.POSTERURL).attr("src"));
				oFilm.setUrl(element.select(Phim14.URL).attr("href"));
				oFilm.setViews(100);
				oFilm.setYear(2017);
				listFilm.add(oFilm);
			}
		} catch (Exception e) {
			HandlerException
					.handlingException(
							e,
							"Get list Film from url \""
									+ url
									+ "\" fail! could your url wrong please check url again. Thank you");
		}
		return listFilm;
	}

	public FilmDetail getFilmDetail(String url) throws Exception {
		FilmDetail oFilmDetail = new FilmDetail();
		try {
			Document docFilmDetail = Jsoup.connect(url).get();
			Elements eListFilm = docFilmDetail.select(Phim14.THUMBNAIL);
			oFilmDetail.Thumbnail = eListFilm.attr("src");
			Elements listFilmInfo = docFilmDetail.select(Phim14.FILM_INFO);
			oFilmDetail.Name = listFilmInfo.get(0).select("font").text();
			Elements FilmDescription = docFilmDetail.select(Phim14.FILM_Description);
			oFilmDetail.Description = FilmDescription.text();
			oFilmDetail.Director = listFilmInfo.get(1).select("a").text();
			oFilmDetail.Actor = listFilmInfo.get(2).select("a").text();
			oFilmDetail.Category = listFilmInfo.get(3).select("a").text();
			oFilmDetail.National = listFilmInfo.get(4).select("a").text();
			oFilmDetail.Duration = listFilmInfo.get(5).text();
			oFilmDetail.Year_Of_Release = listFilmInfo.get(6).select("a")
					.text();
			oFilmDetail.Care = listFilmInfo.get(7).text();
			oFilmDetail.Status = listFilmInfo.get(8).select("font").text();
			oFilmDetail.Watch_URL = docFilmDetail.select(Phim14.WATCH_FILM_URl)
					.attr("href");
			oFilmDetail.ListServerFilm = this
					.getListServerFilm(oFilmDetail.Watch_URL);
		} catch (Exception e) {
			HandlerException
					.handlingException(
							e,
							"Get list Film from url \""
									+ url
									+ "\" fail! could your url wrong please check url again. Thank you");
		}
		return oFilmDetail;
	}

	public String getWatchFilmUrl(String url) throws Exception {
		String sWatchFilmUrl = "";
		try {
			String sWatchCode = this.getWatchLinkCode(url);
			StringBuilder sbUrlParam = new StringBuilder();
			sbUrlParam.append("link=");
			sbUrlParam.append(sWatchCode);
			sbUrlParam.append("&f=true");
			Curl oCurl=new Curl();
			sWatchFilmUrl = oCurl.postRequest(Phim14.Api_Get_Link,
					sbUrlParam.toString());
		} catch (Exception e) {
			HandlerException
					.handlingException(
							e,
							"Get list Film from url \""
									+ url
									+ "\" fail! could your url wrong please check url again. Thank you");
		}
		return sWatchFilmUrl;
	}

	private List<ServerFilm> getListServerFilm(String url) throws Exception {
		List<ServerFilm> listServerFilm = new ArrayList<ServerFilm>();
		try {
			Document DocWatchFilm = Jsoup.connect(url).get();
			Elements eServerFilm = DocWatchFilm.select(Phim14.SERVER_LIST);
			Elements eServer = eServerFilm.select(Phim14.SERVER);
			for (Element element : eServer) {
				ServerFilm oServerFilm = new ServerFilm();
				oServerFilm.Server = element.select(Phim14.SERVER_NAME).text();
				Elements eListEpisode = element.select(Phim14.LIST_EPISODE);
				List<Episode> oListEpisode = new ArrayList<Episode>();
				for (Element element_episode : eListEpisode) {
					Episode oEpisode = new Episode();
					oEpisode.Episode = element_episode.text();
					oEpisode.EpisodeUrl = element_episode.select(
							Phim14.ORIGNAl_LINK_EPISODE).attr("href");
					oListEpisode.add(oEpisode);
				}
				oServerFilm.ListFilm = oListEpisode;
				listServerFilm.add(oServerFilm);
			}
		} catch (Exception e) {
			HandlerException
					.handlingException(
							e,
							"Get list Film from url \""
									+ url
									+ "\" fail! could your url wrong please check url again. Thank you");
		}
		return listServerFilm;
	}

	private String getWatchLinkCode(String url) throws Exception {
		String sWatchLink = "";
		try {
			Document docFilmCurrent = Jsoup.connect(url).get();
			String sScript = docFilmCurrent.select(Phim14.CODE_WATCH_LINK)
					.get(1).data().trim();
			sWatchLink = sScript.substring(sScript.indexOf("{link:") + 7,
					sScript.indexOf("\",preload:true"));
		} catch (Exception e) {
			HandlerException
					.handlingException(
							e,
							"Get list Film from url \""
									+ url
									+ "\" fail! could your url wrong please check url again. Thank you");
		}
		return sWatchLink;
	}

}
