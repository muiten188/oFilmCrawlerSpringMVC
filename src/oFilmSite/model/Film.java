package oFilmSite.model;

/**
 * Created by Bui Dinh BACH on 5/8/2017.
 */
public class Film {
    public int Id;
    public String Name1;
    public String Name2;
    public String Url;
    public String PosterUrl;
    public String Status;
    public String Category;
    public int Views;
    public int Year;
	public String getName1() {
		return Name1;
	}
	public void setName1(String name1) {
		Name1 = name1;
	}
	public String getName2() {
		return Name2;
	}
	public void setName2(String name2) {
		Name2 = name2;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getPosterUrl() {
		return PosterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		PosterUrl = posterUrl;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getViews() {
		return Views;
	}
	public void setViews(int views) {
		Views = views;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
    
}
