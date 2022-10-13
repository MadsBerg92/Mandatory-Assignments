public class Food {

    protected String name;
    protected int price;

    
    public Food(String n, int p){

        name = n;
        price = p;

     }


    public int getPrice(){
       return price;

    }
    public void display(){

       System.out.println( price + " kr " + name);
      
    }

    

   
    
}
