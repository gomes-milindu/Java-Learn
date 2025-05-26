public class bankAccount {
    private int accountNumber = 100;
    private int accountBalance;
    private String customerName = "Milindu";
    private String email;
    private int phoneNumber;

    

    public int depositFunds(int depositMoney){
        accountBalance += depositMoney;
        return accountBalance;
    }

    public String withdrawingFunds(int withdrawMoney){
        if(accountBalance - withdrawMoney< 0 ){
            return "Not Allowed";
        }else{
            int sum = accountBalance - withdrawMoney ;
            String sum1 = Integer.toString(sum);
            return sum1;
            
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
  
}
