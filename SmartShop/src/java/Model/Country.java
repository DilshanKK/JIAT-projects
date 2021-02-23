package Model;

import java.util.ArrayList;

public class Country {
    
    
    public static ArrayList<Country> countries = new ArrayList<Country>();
    
    
    static {
        countries.add(new Country(1,"Sri Lanka"));
        countries.add(new Country(2,"India"));
        countries.add(new Country(3,"Afganistan"));
        countries.add(new Country(4,"Bangladesh"));
        countries.add(new Country(5,"Philipene"));
        countries.add(new Country(6,"Canada"));
        countries.add(new Country(7,"Saudi Arab"));
        countries.add(new Country(8,"Australia"));
        countries.add(new Country(9,"New Zealand"));
        countries.add(new Country(10,"USA"));
        countries.add(new Country(11,"UK"));
        countries.add(new Country(12,"Pakistan"));
        countries.add(new Country(13,"Japan"));
        countries.add(new Country(14,"China"));
        countries.add(new Country(15,"Korea"));
        countries.add(new Country(16,"Zimbabwe"));
        countries.add(new Country(17,"West Indies"));
    }
    
    
    private int id;

    private String country;

    public Country(int id, String country) {
        this.id = id;
        this.country = country;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
