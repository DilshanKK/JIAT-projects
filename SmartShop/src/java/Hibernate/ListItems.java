package Hibernate;
// Generated Feb 1, 2018 2:28:22 AM by Hibernate Tools 4.3.1



/**
 * ListItems generated by hbm2java
 */
public class ListItems  implements java.io.Serializable {


     private Integer id;
     private List list;
     private Stock stock;
     private String status;

    public ListItems() {
    }

	
    public ListItems(List list, Stock stock) {
        this.list = list;
        this.stock = stock;
    }
    public ListItems(List list, Stock stock, String status) {
       this.list = list;
       this.stock = stock;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public List getList() {
        return this.list;
    }
    
    public void setList(List list) {
        this.list = list;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


