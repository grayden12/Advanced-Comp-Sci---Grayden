import Unit0RectangleLab.Rectangle;

public class Firehose {

    private String color;
    private int cost;
    private boolean inUse;
    private double weight;
    private int length;
 
    public String getColor(){
        return color;
    }
    public int getCost(){
        return cost;
    }
    public boolean getInuse(){
        return inUse;
    }
    public double getWeight(){
        return weight;
    }
    public int length(){
        return length;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setCost(int newCost){
        this.cost = newCost;
    }
    public void setInUse(boolean newUse){
        this.inUse = newUse;
    }
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
    public void setLength(int newLength){
        this.length = newLength;
    }
    
    public Firehose() {
        color = "grey";
        cost = 1200;
        inUse = false;
        weight = 25.5;
        length = 100;
    }
    public void use(){
        inUse = true;
        System.out.println("Using");
    }
    public String toString(){
        return "Firehose: color - " + color + "  cost - " + cost + 
        " inUse - " + inUse + " weight - " + weight + " length - " + length;
    }
    public boolean equals(Firehose anotherFirehose){
        if (this.cost == anotherFirehose.cost &&
        this.weight == anotherFirehose.weight &&
        this.length == anotherFirehose.length &&
        this.inUse == anotherFirehose.inUse &&
        this.color.equals(anotherFirehose.color)){
            return true;
        }
        else{return false;}
    } 
    public void paint(){
        color = "Blue";
        cost = cost + 5;

        if (cost > 1210) {
            System.out.println("The cost is getting out ofhand");
        }
        System.out.println("Cost is:" + cost);
        
        
    }
    public void drinkMe (double amount){
        if (amount <= weight){
            System.out.println(("Drunk"));
            weight -= amount;

        } 
        else{
            System.out.println(("Not enough water"));
        }
            
    
    }
    public void unwind(){
        System.out.println("Un winded");
        System.out.println(color);
       
    }

}