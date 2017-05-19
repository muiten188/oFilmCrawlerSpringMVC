package oFilmSite.services.iservices;

import java.util.List;

import org.springframework.stereotype.Service;

import oFilmSite.model.Film;
@Service
public interface IPhim14Services {
	public List<Film> getListFilm(String url);
}
