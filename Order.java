
class Order {
    private String item;
    private int quantity;

    public Order(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }


    public static void main(String[] args) {
        Order order1 = new Order("Bread",2);
        totalCalculation totalC1 = new totalCalculation(130);
        totalC1.calculateTotal(order1);

        System.out.println();


        Order order2 = new Order("Pastry",5);
        totalCalculation totalC2 = new totalCalculation(100);
        totalC2.calculateTotal(order2);

    }
}

interface CalculatePrice{
    void calculateTotal(Order order);
}

class totalCalculation implements CalculatePrice{
   private int price;

   public totalCalculation(int price){
       this.price = price;
   }


    @Override
    public void calculateTotal(Order order) {
        System.out.println(" Total price of "+order.getQuantity()+" " + order.getItem() +" is RS " + (order.getQuantity()*price));
    }
}
