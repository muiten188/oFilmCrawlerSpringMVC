package ofilmsite.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bui Dinh BACH on 5/9/2017.
 */
public class ServerFilm {
	@JsonProperty("Id")
    public int Id;
	@JsonProperty("Server")
    public String Server;
	@JsonProperty("ListFilm")
    public List<Episode> ListFilm;
	@JsonProperty("Server")
	public String getServer() {
		return Server;
	}
	public void setServer(String server) {
		Server = server;
	}
	@JsonProperty("ListFilm")
	public List<Episode> getListFilm() {
		return ListFilm;
	}
	public void setListFilm(List<Episode> listFilm) {
		ListFilm = listFilm;
	}
    
}
