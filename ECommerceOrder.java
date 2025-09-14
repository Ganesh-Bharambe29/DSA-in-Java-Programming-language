import java.util.Scanner;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;
class Product
{
    String Name;
    double Price;
    int quantity;
    Product()
    {
        this.Name="unknown";
        this.Price=0.0;
        this.quantity=1;

    }
    Product(String Name,double Price)
    {
        this.Name=Name;
        this.Price=Price;
        this.quantity=1;
    }
    Product(String Name,double Price,int quantity)
    {
        this.Name=Name;
        this.Price=Price;
        this.quantity=quantity;
    }
    double getTotalPrice()
    {
        return Price*quantity;
    }
}
public class ECommerceOrder 
{
    static final double DISCOUNT_THRESHOLD=500.0;
    static final double DISCOUNT_RATE=0.1;
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("==E-Commerce Order Processing==");
        System.out.println("Enter the product to order:");
        int n=sc.nextInt();
        sc.nextLine();

        Product products[]=new Product[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n Enter the details for Product"+(i+1));
            System.out.print("Product Name:");
            String name=sc.nextLine();
            System.out.print("Price:");
            double Price=sc.nextDouble();
            System.out.print("Quantity:");
            int quantity=sc.nextInt();
            sc.nextLine();
            
            products[i]=new Product(name,Price,quantity);
        }
        double total=0.0;
        for(Product p:products)
        {
            total+=p.getTotalPrice();
        }
        double discount=0.0;
        if(total>=DISCOUNT_THRESHOLD)
        {
            discount=total*DISCOUNT_RATE;
        }
        double finalAmount=total-discount;
        System.out.println("\n===Invoice===");
        for(Product p:products)
        {
            System.out.printf("%-20s Rs.%9.2f %-10d Rs.%-10.2f\n",p.Name,p.Price,p.quantity,p.getTotalPrice());
        }
        System.out.println("---------------------------------------");
        System.out.printf("Subtotal: Rs.%.2f\n",total);
        System.out.printf("Discount : Rs.%2f\n",discount);
        System.out.printf("Final Amount to Pay: Rs.%.2f\n",finalAmount);
        System.out.println("Thank you for Shopping with us!");
        sc.close();

    }
}