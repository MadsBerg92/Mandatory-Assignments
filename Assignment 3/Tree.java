public class Tree {
   
    private int age;
    private double height;
    private double growthPct;

    Tree (double g){
        
        age = 1;
        height = 0.25;
        growthPct = g;
    }

    public String toString() {
        String r = "Tree(age = " + age + ", height = " + height + ")";

        return r;

    }
    public void growOneYear(){

        age++;
        height = height * (1+growthPct/100);
        
        
        if (height >20.00){

            height = 20; 
                    
    }
}
}
