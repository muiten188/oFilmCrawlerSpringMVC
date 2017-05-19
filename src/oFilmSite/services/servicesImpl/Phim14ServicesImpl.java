package ofilmsite.services.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import ofilmsite.common.page_config.Phim14;
import ofilmsite.model.Film;
import ofilmsite.services.iservices.IPhimServices;

@Service
public class Phim14ServicesImpl implements IPhimServices {
	public List<Film> getListFilm(String url) throws Exception{
		List<Film> listFilm=new ArrayList<>();
        try {
            Document docFilm = Jsoup.connect(url).get();
            Elements eListFilm = docFilm.select(Phim14.LIST_FILM);
            for (Element element : eListFilm) {
                Film oFilm=new Film();
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
            throw new Exception("Get list Film from url \""+url+"\" fail! could your url wrong please check url again. Thank you");
        }
		return listFilm;
	}
}
