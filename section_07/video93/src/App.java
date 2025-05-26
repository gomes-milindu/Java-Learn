public class App {
    public static void main(String[] args){
        Employee tim =  new Employee("Tim", "11/11/1985",  "01/01/2020");
        System.out.println(tim);

        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());


        salariedEmployee tom =  new salariedEmployee("Tom", "11/10/1985",  "01/01/2020",3500.00,true
        );
        System.out.println(tom);
        System.out.println("Toms paycheck " + tom.collectPay());
    }
}
