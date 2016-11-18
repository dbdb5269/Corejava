package XML.homework2;

/**
 * Created by dubo on 16/10/27.
 */

public class Cd {
    private String code;
    private String title;
    private String artist;
    private String country;
    private String company;
    private Double price;
    private String year;
    public Cd(String code,String title,String artist,String country,String company,Double price,String year){
        this.code = code;
        this.title = title;
        this.artist = artist;
        this.company=company;

        this.country = country;
        this.price = price;
        this.year = year;
    }
    public String getArtist() {
        return artist;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public Double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public Cd(){

    }

}
