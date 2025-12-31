package SOLID.OpenClosed.OpenClosedImpl;

import SOLID.OpenClosed.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{
    Invoice invoice;
    public DatabaseInvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void save(){
        // saving data to db
    }
}
