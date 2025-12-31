package SOLID.OpenClosed;

//OCF - Open for extension but closed for modification
public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveDb(){
        //logic here to save data to db
    }

    // this voilates OCF
    //everytime we add a new save function we modify the existing InvoiceDao
    public void saveToFile(){
        //
    }
    // to achieve this is by inheritance
    //        [InvoiceDao] <<Interface>>
    //      is-a |      | is-a           |
    // [DBInvoiceDao]  [FileInvoiceDao]  [InMemoryInvoiceDao] [so whenever a new feature is there it is open for extension]
    // see this implementation for better understanding
}
