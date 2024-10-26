
class Invoice {

    private double amount;
    private String customer;

    public Invoice(double amount, String customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomer() {
        return customer;
    }

    public static class printInvoice{
        public void print(Invoice invoice) {

            System.out.println();
            System.out.println(" Invoice details");
            System.out.println(" Amount   : " + invoice.getAmount());
            System.out.println(" Customer : " + invoice.getCustomer());
        }
    }
    public static class saveToDatabase{
        public void saveData(Invoice invoice){
            System.out.println();
            System.out.println(" Invoice saved to database");
            System.out.println(" Amount   : " + invoice.getAmount());
            System.out.println(" Customer : " + invoice.getCustomer());
        }
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000.00,"Lakindu Nimesh");

        printInvoice printinvoice = new printInvoice();
        printinvoice.print(invoice);

        saveToDatabase savetodatabase = new saveToDatabase();
        savetodatabase.saveData(invoice);


    }
}
