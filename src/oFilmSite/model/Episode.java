package oFilmSite.model;
/**
 * Created by Bui Dinh BACH on 5/9/2017.
 */
public class Episode {
    public int Id;
    public String Episode;
    public String EpisodeUrl;
    public String EposodeWatchUrl;
    public String Eposode_Code_Link;
	public String getEpisode() {
		return Episode;
	}
	public void setEpisode(String episode) {
		Episode = episode;
	}
	public String getEpisodeUrl() {
		return EpisodeUrl;
	}
	public void setEpisodeUrl(String episodeUrl) {
		EpisodeUrl = episodeUrl;
	}
	public String getEposodeWatchUrl() {
		return EposodeWatchUrl;
	}
	public void setEposodeWatchUrl(String eposodeWatchUrl) {
		EposodeWatchUrl = eposodeWatchUrl;
	}
	public String getEposode_Code_Link() {
		return Eposode_Code_Link;
	}
	public void setEposode_Code_Link(String eposode_Code_Link) {
		Eposode_Code_Link = eposode_Code_Link;
	}
}
