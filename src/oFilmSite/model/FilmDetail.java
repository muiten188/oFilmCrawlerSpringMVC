package oFilmSite.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by haiphutruoi on 5/8/2017.
 */
public class FilmDetail {
	@JsonProperty("Id")
    public int Id;
    @JsonProperty("Thumbnail")
    public String Thumbnail;
    @JsonProperty("Name")
    public String Name;
    @JsonProperty("Description")
    public String Description;
    @JsonProperty("Director")
    public String Director;
    @JsonProperty("Actor")
    public String Actor;
    @JsonProperty("Category")
    public String Category;
    @JsonProperty("National")
    public String National;
    @JsonProperty("Duration")
    public String Duration;
    @JsonProperty("Year_Of_Release")
    public String Year_Of_Release;
    @JsonProperty("Care")
    public String Care;
    @JsonProperty("Status")
    public String Status;
    @JsonProperty("Watch_URL")
    public String Watch_URL;
    @JsonProperty("ListServerFilm")
    public List<ServerFilm> ListServerFilm;
    @JsonProperty("Thumbnail")
	public String getThumbnail() {
		return Thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.Thumbnail = thumbnail;
	}
	 @JsonProperty("Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@JsonProperty("Description")
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	 @JsonProperty("Director")
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	 @JsonProperty("Actor")
	public String getActor() {
		return Actor;
	}
	public void setActor(String actor) {
		Actor = actor;
	}
	 @JsonProperty("Category")
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@JsonProperty("National")
	public String getNational() {
		return National;
	}
	public void setNational(String national) {
		National = national;
	}
	@JsonProperty("Duration")
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	@JsonProperty("Year_Of_Release")
	public String getYear_Of_Release() {
		return Year_Of_Release;
	}
	public void setYear_Of_Release(String year_Of_Release) {
		Year_Of_Release = year_Of_Release;
	}
	@JsonProperty("Care")
	public String getCare() {
		return Care;
	}
	public void setCare(String care) {
		Care = care;
	}
	@JsonProperty("Status")
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@JsonProperty("Watch_URL")
	public String getWatch_URL() {
		return Watch_URL;
	}
	public void setWatch_URL(String watch_URL) {
		Watch_URL = watch_URL;
	}
}
