package Hibernate;
// Generated Feb 1, 2018 2:28:22 AM by Hibernate Tools 4.3.1



/**
 * InvoiceItem generated by hbm2java
 */
public class InvoiceItem  implements java.io.Serializable {


     private Integer id;
     private Invoice invoice;
     private Stock stock;
     private Integer qty;

    public InvoiceItem() {
    }

	
    public InvoiceItem(Invoice invoice, Stock stock) {
        this.invoice = invoice;
        this.stock = stock;
    }
    public InvoiceItem(Invoice invoice, Stock stock, Integer qty) {
       this.invoice = invoice;
       this.stock = stock;
       this.qty = qty;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }




}

