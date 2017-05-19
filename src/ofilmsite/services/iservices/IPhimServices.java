package ofilmsite.services.iservices;

import java.util.List;

import org.springframework.stereotype.Service;

import ofilmsite.model.Film;

@Service
public interface IPhimServices {
	public List<Film> getListFilm(String url) throws Exception;
}
