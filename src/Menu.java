import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lonny on 5/22/2017.
 */
public class Menu {

   private static final ArrayList<MenuItem> appetizers=new ArrayList<>();
   private final ArrayList<MenuItem> Entrees;=new ArrayList<>();
   private final ArrayList<MenuItem> desserts;=new ArrayList<>():
   private Date lastUpdated;
   private static ArrayList<MenuItem> allMenuItems=MenuItem.allMenuItems;

   private static UpdateMenu(){

       for (MenuItem x : allMenuItems){
           
           if (x.getCategory() == "appetizer"){
               appetizers.add(x);
           }
       }
   }
   public static ArrayList<MenuItem> getAppetizers(){
       return appetizers;

   }
}

//}
