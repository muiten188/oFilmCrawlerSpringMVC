package ofilmsite.model;

import java.util.*;

/**
 * Created by haiphutruoi on 5/8/2017.
 */
public class FilmDetail {
    public int Id;
    public String thumbnail;
    public String Name;
    public String Director;
    public String Actor;
    public String Category;
    public String National;
    public String Duration;
    public String Year_Of_Release;
    public String Care;
    public String Status;
    public String Watch_URL;
    public List<ServerFilm> ListServerFilm;
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getActor() {
		return Actor;
	}
	public void setActor(String actor) {
		Actor = actor;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getNational() {
		return National;
	}
	public void setNational(String national) {
		National = national;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getYear_Of_Release() {
		return Year_Of_Release;
	}
	public void setYear_Of_Release(String year_Of_Release) {
		Year_Of_Release = year_Of_Release;
	}
	public String getCare() {
		return Care;
	}
	public void setCare(String care) {
		Care = care;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getWatch_URL() {
		return Watch_URL;
	}
	public void setWatch_URL(String watch_URL) {
		Watch_URL = watch_URL;
	}
}
