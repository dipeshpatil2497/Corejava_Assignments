import java.util.Scanner;

class Product {
    public int pid;
    public float price;
    public int quantity;

    Product() {

    }

    Product(int pid, float price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    // void set(int pid, float price, int quantity){
    // this.pid = pid;
    // this.price = price;
    // this.quantity = quantity;
    // }

    static void calculate(Product[] arr) {
        double res = 0;
        for (Product a : arr) {
            res = res + (double) (a.price * a.quantity);
        }
        System.out.println("Total Amount spent : " + res);
        // return res;
    }

    void show() {
        System.out.println(pid + "  " + price + "  " + quantity);
    }

}

public class Ques39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Product pr[] = new Product[5];
        for (int i = 0; i < pr.length; i++) {
            System.out.print("Enter ID , Price & Quantity : ");
            int id = sc.nextInt();
            float price = sc.nextFloat();
            int quantity = sc.nextInt();
            Product p = new Product(id, price, quantity);
            // p.set(id,price,quantity);
            pr[i] = p;
        }

        float max = pr[0].price;
        Product p = new Product();
        for (Product a : pr) {
            a.show();
            if (a.price > max) {
                max = a.price;
                p = a;
            }
        }

        System.out.println("Max Product element : " + p.pid + "  " + p.price + "  " + p.quantity);
        Product.calculate(pr);
        // for(int i=0; i<pr.length; i++){
        // System.out.println(pr[i]);
        // }

        sc.close();

    }
}