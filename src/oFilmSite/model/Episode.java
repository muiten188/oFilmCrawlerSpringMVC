package oFilmSite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bui Dinh BACH on 5/9/2017.
 */
public class Episode {
	@JsonProperty("Id")
    public int Id;
	@JsonProperty("Episode")
    public String Episode;
	@JsonProperty("EpisodeUrl")
    public String EpisodeUrl;
	@JsonProperty("EposodeWatchUrl")
    public String EposodeWatchUrl;
	@JsonProperty("Eposode_Code_Link")
    public String Eposode_Code_Link;
	@JsonProperty("Episode")
	public String getEpisode() {
		return Episode;
	}
	public void setEpisode(String episode) {
		Episode = episode;
	}
	@JsonProperty("EpisodeUrl")
	public String getEpisodeUrl() {
		return EpisodeUrl;
	}
	public void setEpisodeUrl(String episodeUrl) {
		EpisodeUrl = episodeUrl;
	}
	@JsonProperty("EposodeWatchUrl")
	public String getEposodeWatchUrl() {
		return EposodeWatchUrl;
	}
	public void setEposodeWatchUrl(String eposodeWatchUrl) {
		EposodeWatchUrl = eposodeWatchUrl;
	}
	@JsonProperty("Eposode_Code_Link")
	public String getEposode_Code_Link() {
		return Eposode_Code_Link;
	}
	public void setEposode_Code_Link(String eposode_Code_Link) {
		Eposode_Code_Link = eposode_Code_Link;
	}
}
