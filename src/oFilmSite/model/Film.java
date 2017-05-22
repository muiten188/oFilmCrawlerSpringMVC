package ofilmsite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bui Dinh BACH on 5/8/2017.
 */
public class Film {
	@JsonProperty("Id")
    public int Id;
	@JsonProperty("Name1")
    public String Name1;
	@JsonProperty("Name2")
    public String Name2;
	@JsonProperty("Url")
    public String Url;
	@JsonProperty("PosterUrl")
    public String PosterUrl;
	@JsonProperty("Status")
    public String Status;
	@JsonProperty("Category")
    public String Category;
	@JsonProperty("Views")
    public int Views;
	@JsonProperty("Year")
    public int Year;
	@JsonProperty("Name1")
	public String getName1() {
		return Name1;
	}
	public void setName1(String name1) {
		Name1 = name1;
	}
	@JsonProperty("Name2")
	public String getName2() {
		return Name2;
	}
	public void setName2(String name2) {
		Name2 = name2;
	}
	@JsonProperty("Url")
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	@JsonProperty("PosterUrl")
	public String getPosterUrl() {
		return PosterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		PosterUrl = posterUrl;
	}
	@JsonProperty("Status")
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@JsonProperty("Category")
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@JsonProperty("Views")
	public int getViews() {
		return Views;
	}
	public void setViews(int views) {
		Views = views;
	}
	@JsonProperty("Year")
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
    
}
