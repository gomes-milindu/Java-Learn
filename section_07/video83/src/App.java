public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Milindu","2000","gomesmilindu@gmail.com");
        System.out.println("Name: " + customer.getName());
        System.out.println("Credit Limit: " + customer.getCreditLimit());
        System.out.println("Email: " + customer.getEmail());
    }
}
