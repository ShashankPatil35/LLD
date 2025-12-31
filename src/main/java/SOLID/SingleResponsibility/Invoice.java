package SOLID.SingleResponsibility;

// Now let's say this Invoice class does - calculating total, saving to db, printing the invoice
// which violates Single Responsibility principle
// to solve that we can make 2-3 classes - 1 Invoice(calculating total), InvoiceDao(saving to db), InvoicePrinter(printing the invoice)
// having many responsiblites in one classes is a harm to other class - thats the idea of making new class so if needed to change anything only that class will be effected
//like saving to db class(InvoiceDao) what if later we  opted from mysql to non-sql
public class Invoice {
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(int quantity){
        return this.marker.price * quantity;
    }
}
