import java.util.ArrayList;
import java.util.Date;
import java.lang.Long;


/**
 * Created by lonny on 5/22/2017.
 */
public class MenuItem {
    private String title;
    private Date created;
    private String ingredients;
    private double price;
    private final String category;

    public MenuItem (String title,String ingredients, double price, String category){
        this.title = title;
        this.created = new Date();
        this.ingredients = ingredients;
        this.price = price;
        this.category = category;
    }

    public MenuItem(String title){
        this(title,"",0,"");


    }

    public void setIngredients(String ingredients){
        this.ingredients=ingredients;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String toString() {
        this.created= new Date();
        return this.title + this.price +this.created +this.ingredients;


    }

}
