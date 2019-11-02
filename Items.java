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
    private String describe;
    private int weight;
    private ArrayList<Items> items;
    
    /**
     * Constructor for objects of class Items
     * @param describe
     * @param weight
     */
    public Items(String describe, int weight){
        //initialize instance variables 
        describe = describe;
        weight = weight;
        this.items = new ArrayList<Items>();
    }
    
    /**
     * Return description of the item
     */
    public String getShortDescription(){
        return describe;
    }
    
    
}
