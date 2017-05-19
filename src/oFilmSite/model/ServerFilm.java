package ofilmsite.model;
import java.util.List;

/**
 * Created by Bui Dinh BACH on 5/9/2017.
 */
public class ServerFilm {
    public int Id;
    public String Server;
    public List<Episode> ListFilm;
	public String getServer() {
		return Server;
	}
	public void setServer(String server) {
		Server = server;
	}
	public List<Episode> getListFilm() {
		return ListFilm;
	}
	public void setListFilm(List<Episode> listFilm) {
		ListFilm = listFilm;
	}
    
}
