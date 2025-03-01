/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that models a pizza cutter.
 * We only ever want one pizza cutter to 
 * cut the pizzas to ensure consistency.
 * Users can choose how many slices to
 * divide the pizza into.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */

// Author James Faloon Added a Singleton design pattern 
public class PizzaCutter {
    private static PizzaCutter instance;
    public int numSlices = 0;// how many pieces to cut the pizza into
    private PizzaCutter() {
        //intentionally left blank
    }
    
    
    public static PizzaCutter getInstance() {
        if (instance == null) {
            instance = new PizzaCutter();   
        }
        return instance;
    }
}
