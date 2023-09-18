public class Mainclass {
    public static void main(String[] args) {

        Encapsulation encapsulation1 = new Encapsulation();
        encapsulation1.setName("Ajan");
        encapsulation1.setAddress("Matale");
        encapsulation1.setContact(713319400);
        encapsulation1.setEmail("ajan.eshwara@gmail.com");

        System.out.println(encapsulation1.getName());
        System.out.println(encapsulation1.getAddress());
        System.out.println(encapsulation1.getContact());
        System.out.println(encapsulation1.getEmail());

     Encapsulation encapsulation2 = new Encapsulation("Kasun", "Kandy", 773213546, "safkl;;htknkk"); 
            System.out.println(encapsulation2);
        
    }
}
