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
public class Items{   // item desc, weight + hashmap to store set of items with assoc keys
    private String description;
    private int weight;
    private String name;
    private HashMap<String, Items> items;
   
    /**
     * Constructor for objects of class Item
     * @param name the name of item
     * @param description the decription of an item 
     * @param weight the weight of an item 
     */
    public Items(String name, String description, int weight){
        // initialise instance variables
        this.name = name;
        this.description = description;
        this.weight = weight;
        items = new HashMap<String, Items>();

  
    }
   
   
    /**

     * Get the item description. 
     * @returns a description of the item and area
     */
    public String getDescription()
    {
        // put your code here
        String iString = "In this area: ";
        iString = iString + this.description + "\nItem weight: " + this.weight;
        return iString;
    }
    
    /**
    *add items to items HashMap
    *
    */
    private void addItems()
    {
        items.put("flier", new Items("flier", "there is a flier for a club on the floor",
                        0));
        items.put("baccy", new Items("baccy", "there is a pouch of tobacco on\n" +
            "the table, your friends say you may help yourself if you can find\n" +
            "rolling papers, filter tips and a lighter.",2));
        items.put("skins", new Items("skins", "there is a packet of rolling papers on the bar.", 1));
        items.put("filters", new Items("filters", "there are some filter tips lying on the side", 1));
        items.put("lighter", new Items("lighter", "there is a lighter on the window cill", 1));
        items.put("phone", new Items("phone", "you spy a smartphone in one of the pockets",5));
        items.put("bag", new Items("bag", "a woman has left her handbag\n" + "on a table", 10));
        items.put("coat", new Items("coat", "there is a beautiful coat that has been left\n" +
                             "on a barstoll", 6));
        items.put("jukebox", new Items("jukebox", "the jukebox plays out some big band music",   1500));      
   
 
    }
    
    
}
