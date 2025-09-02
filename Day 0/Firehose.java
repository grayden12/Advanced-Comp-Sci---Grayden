public class Firehose {

    private String color;
    private int cost;
    private boolean inUse;
    private double weight;
    private int length;
 
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
        else
            System.out.println(("Not enough water"));
    
    }
    public void unwind(){
        System.out.println("Un winded");
        System.out.println(color);
       
    }

}