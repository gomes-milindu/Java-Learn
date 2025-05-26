public class smartKitchen {
    
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refridgerator iceBox;
    
    
    public smartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refridgerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }


    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }


    public DishWasher getDishWasher() {
        return dishWasher;
    }


    public Refridgerator getIceBox() {
        return iceBox;
    }


    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }


    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }


    public void setIceBox(Refridgerator iceBox) {
        this.iceBox = iceBox;
    }

    public boolean addWater(){
        return true;
    }

    public boolean pourMilk(){
        return true;
    }

    public void loadDishWasher(){

    }

    public void setKitchenState(){

    }

    public void doKitchenWork(){

    }
    
}
