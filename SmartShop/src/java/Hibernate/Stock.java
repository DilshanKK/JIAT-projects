package Hibernate;
// Generated Feb 1, 2018 2:28:22 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private Integer id;
     private Product product;
     private Integer availableQty;
     private Double unitPrice;
     private Set<InvoiceItem> invoiceItems = new HashSet<InvoiceItem>(0);
     private Set<ListItems> listItemses = new HashSet<ListItems>(0);

    public Stock() {
    }

	
    public Stock(Product product) {
        this.product = product;
    }
    public Stock(Product product, Integer availableQty, Double unitPrice, Set<InvoiceItem> invoiceItems, Set<ListItems> listItemses) {
       this.product = product;
       this.availableQty = availableQty;
       this.unitPrice = unitPrice;
       this.invoiceItems = invoiceItems;
       this.listItemses = listItemses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getAvailableQty() {
        return this.availableQty;
    }
    
    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Set<InvoiceItem> getInvoiceItems() {
        return this.invoiceItems;
    }
    
    public void setInvoiceItems(Set<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
    public Set<ListItems> getListItemses() {
        return this.listItemses;
    }
    
    public void setListItemses(Set<ListItems> listItemses) {
        this.listItemses = listItemses;
    }




}


