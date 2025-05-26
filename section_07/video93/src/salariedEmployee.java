public class salariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    

    public salariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        
    }

    @Override

    public double collectPay(){
        return (int) annualSalary / 26;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
    
}
