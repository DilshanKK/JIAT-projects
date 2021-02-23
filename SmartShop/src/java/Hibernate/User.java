package Hibernate;
// Generated Feb 1, 2018 2:28:22 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String email;
     private String password;
     private String mobile;
     private String country;
     private String imgUrl;
     private String type;
     private Set<List> lists = new HashSet<List>(0);
     private Set<Invoice> invoices = new HashSet<Invoice>(0);

    public User() {
    }

    public User(String name, String email, String password, String mobile, String country, String imgUrl, String type, Set<List> lists, Set<Invoice> invoices) {
       this.name = name;
       this.email = email;
       this.password = password;
       this.mobile = mobile;
       this.country = country;
       this.imgUrl = imgUrl;
       this.type = type;
       this.lists = lists;
       this.invoices = invoices;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set<List> getLists() {
        return this.lists;
    }
    
    public void setLists(Set<List> lists) {
        this.lists = lists;
    }
    public Set<Invoice> getInvoices() {
        return this.invoices;
    }
    
    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }




}

