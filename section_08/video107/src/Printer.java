public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;

        if(tonerLevel > 100 || tonerLevel < 0){
            return -1;
        }else{
            return tonerLevel;
        }
    }

    public int printPages(int pages){
        
        int sheet;

        if(pages%2 ==0){
            sheet = pages / 2;
        }else{
            sheet = pages;
        }
        
        if(duplex == true){
            System.out.println("Its duplex");
        }

        return sheet;
    }

    
}
