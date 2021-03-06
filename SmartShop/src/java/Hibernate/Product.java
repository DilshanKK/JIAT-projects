package Hibernate;
// Generated Feb 1, 2018 2:28:22 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer id;
     private Brand brand;
     private String model;
     private Date releaseDate;
     private String description;
     private String imgUrl;
     private Set<Stock> stocks = new HashSet<Stock>(0);

    public Product() {
    }

	
    public Product(Brand brand) {
        this.brand = brand;
    }
    public Product(Brand brand, String model, Date releaseDate, String description, String imgUrl, Set<Stock> stocks) {
       this.brand = brand;
       this.model = model;
       this.releaseDate = releaseDate;
       this.description = description;
       this.imgUrl = imgUrl;
       this.stocks = stocks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Brand getBrand() {
        return this.brand;
    }
    
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public Date getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public Set<Stock> getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }




}


