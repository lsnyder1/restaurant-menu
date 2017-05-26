/**
 * Created by lonny on 5/25/2017.
 */
public class Main {



    public static void main(String[] args){

        MenuItem fries = new MenuItem("French fries");

        fries.setIngredients("potatoes, salt,fat");
        System.out.println(fries.toString());
        System.out.println(MenuItem.getAllMenuItems().toString());
    }
}
