import java.util.ArrayList;
import java.util.Date;
import java.lang.Long;


/**
 * Created by lonny on 5/22/2017.
 */
public class MenuItem {
    private String title;
    private Date created;
    private final ArrayList <String> ingredients = new ArrayList<>();
    private double price;
    private final String category;

    public MenuItem (String title,ArrayList<String> ingredients, double price, String category){
        this.title = title;
        this.created= new Date();
        this.ingredients.addAll(ingredients);
        this.price=price;
        this.category = category;
    }

    public MenuItem(String title){
        this(title,ingredients,0,"");


    }

    public String toString() {
        this.created= new Date();
        return this.title + this.price +this.created;


    }

}
