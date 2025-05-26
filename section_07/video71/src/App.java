public class App {
    public static void main(String[] args){
        Car car = new Car();
        car.setMake("Porshe");
        car.setModel("Kanishka");
        System.out.println("Make: " + car.getMake());
        
        System.out.println("Model: " + car.getModel());
        car.desdcribe();
    }
}
