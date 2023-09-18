package Abstraction;

public class MainClass {
    public static void main(String[] args) {
        MyImplimantation myImplimantation = new MyImplimantation();
        int calculateTotal = myImplimantation.calculateTotal(10, 20);
        System.out.println(calculateTotal);
        
    }
}
