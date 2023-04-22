package edu.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Shows ramdom fast food resturant with attributes
        fastfood rest= new fastfood();
        System.out.println(rest);

        //Shows custom method rank based on rating attribute
        System.out.println("Rating"+rest.rank());
        //Shows custom method rank based on price attribute
        System.out.println("Price"+ rest.rankPrice());

       fastFoodItem item = new fastFoodItem();
        System.out.println(item);
        
        

     
    

    }
}
