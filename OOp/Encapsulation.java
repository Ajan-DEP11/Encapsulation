public class Encapsulation {

    private String Name;
    private String Address;
    private int Contact;
    private String Email;


    Encapsulation(){

    }

    Encapsulation(String Name, String Address, int Contact, String Email){

        this.Name = Name;
        this.Address= Address;
        this.Contact = Contact;
        this.Email = Email;

    }

    public void setName(String name) {
        this.Name = Name;
    }

    public void setAddress(String address) {
        this.Address = Address;
    }

    public void setContact(int contact) {
        this.Contact = Contact;
    }

    public void setEmail(String email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getContact() {
        return Contact;
    }

    public String getEmail() {
        return Email;
    }

    

}