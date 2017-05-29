import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;

/**
 * Created by lonny on 5/25/2017.
 */
public class Main {



    public static void main(String[] args){

        MenuItem fries = new MenuItem("French fries","potatoes",12.00,"appetizer");

        //fries.setIngredients("potatoes, salt,fat");
        System.out.println(fries.toString());
        System.out.println(MenuItem.getAllMenuItems());
        System.out.println(Menu.getAppetizers());
    }
}
