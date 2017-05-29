import java.util.ArrayList;
import java.util.Date;
import java.lang.Long;


/**
 * Created by lonny on 5/22/2017.
 *///fields
public class MenuItem {
    private String title;
    private Date created;
    private String ingredients;
    private double price;
    private final String category;
    public static ArrayList<MenuItem> allMenuItems;

    //constructors
    public MenuItem (String title,String ingredients, double price, String category){
        this.title = title;
        this.created = new Date();
        this.ingredients = ingredients;
        this.price = price;
        this.category = category;
        allMenuItems.add(this);
    }

    public MenuItem(String title){
        this(title,"",0,"");


    }
    //getters and setters
    public String getTitle(String title){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public Date getCreated(Date created){
        return this.created;
    }
    public String getIngredients(String ingredients){
        return this.ingredients;
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
    public static ArrayList<MenuItem> getAllMenuItems(){

        return MenuItem.allMenuItems;
    }

}
