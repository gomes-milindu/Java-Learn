public class Dog extends Animal {
    
    private String earShape;
    private String tailShape;
    
    public Dog(){
        super("Mutt","Big",50);
    }
   
    // public Dog(String type, double weight){
    //     this(type,weight,"Perky","Curled");
    // }
    
    

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString() + "]";
    }

    
    
}
