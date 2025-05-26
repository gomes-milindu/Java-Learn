public class Car {
    private String make;
    private String model;
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }
    

    public void setMake(String make) {
        if(make == null){
            make = "Unknown";
        }
        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "holden","porshe","tesla":
                this.make = make;
                break;
        
            default:
                this.make = "Unsupported";
                break;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void desdcribe(){
        System.out.println(doors + "-Door " + 
        color + " " +
        make + " " +
        model + " " + 
        (convertible ? "Convertible" : "Not convertible"));
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
