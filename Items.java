import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
/**
 * Write a description of class Items here.
 *
 * @author Kazeem Azeez
 * @version 2019.10.26
 */
public class Items
{
   // instance variables 
    private String description;
    private int weight;
    private ArrayList<Items> items;
       /**
         * Constructor for objects of class Item
         * Create an item described "description", and Weight
         */
    public Items(String description, int weight)
    {
        // initialise instance variables
        description = description;
        weight = weight;
        this.items = new ArrayList<Items>();
    }
    
    
    /**
     * Return the description of the item
     */
    public String getShortDescription()
    {
        return description;
    }
    
    /**
     * Return the weight of the item
     */
    public int weight()
    {
        return weight;
    }
    
    /**
     * Return a long description of the item that includes the description 
     * and weight.
     */
    public String getLongDescription()
    {
        return "Item " + description + " Weight " + weight;
    }
    
    /**
     * create a variety of items
     */
    public void add(Items item)
    {
        items.add(item);
    }
    
    
    /**
     * get the item
     */
    public ArrayList<Items> getItems()
    {
        return items;
    }
    
    /**
     * 
     */
    public String getItemString()
    {
        String returnString = "Item:";
        {
            returnString += " " + items;
        }
        return returnString;
    }
    
}
