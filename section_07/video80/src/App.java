public class App {
    public static void main(String[] args){
        bankAccount person = new bankAccount();
        person.setCustomerName("Gomes");
        person.setAccountBalance(1000);
        System.out.println("Deposit: " + person.depositFunds( 125));
        System.out.println("Withdraw: " + person.withdrawingFunds(2000));
        System.out.println("Name: " + person.getCustomerName());
    }
}
