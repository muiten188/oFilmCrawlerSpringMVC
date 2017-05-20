package ofilmsite.services.iservices;

import java.util.List;

import org.springframework.stereotype.Service;

import ofilmsite.model.Film;
import ofilmsite.model.FilmDetail;

@Service
public interface IPhimServices {
	public List<Film> getListFilm(String url) throws Exception;
	public FilmDetail getFilmDetail(String url) throws Exception;
	public String getWatchFilmUrl(String url) throws Exception;
}
