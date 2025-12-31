package SOLID.SingleResponsibility;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveDb(){
        //logic here to save data to db
    }
}
