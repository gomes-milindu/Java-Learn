public class Customer {
    private String name;
    private String creditLimit;
    private String email;
    
    public String getName() {
        return name;
    }
    public String getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
    
    public Customer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    
    public Customer(String name, String email) {
        this(name,"1000",email);
    }
    
    public Customer() {
        this("Nobody","nobody@gmail.com");
    }
     
}
