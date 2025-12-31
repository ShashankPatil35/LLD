package SOLID.OpenClosed.OpenClosedImpl;

import SOLID.OpenClosed.Invoice;

public class FileInvoiceDao implements InvoiceDao{
    Invoice invoice;
    public FileInvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void save(){
        // saving data to db
    }
}
