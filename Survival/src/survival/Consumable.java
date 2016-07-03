/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

/**
 *
 * @author panbe
 */
public class Consumable extends Item {

    private int addHealth;
    private int addHunger;

    public Consumable() {
        super(0, null, 0, null);
    }
    
    public Consumable(int addHealth, int addHunger, int id, String name, int value, String description) {
        super(id, name, value, description);
        this.addHealth = addHealth;
        this.addHunger = addHunger;
    }

    public int getAddHealth() {
        return addHealth;
    }

    public int getAddHunger() {
        return addHunger;
    }
    
    public void printStat() {
        System.out.println(getName());
        System.out.println();
    }
    
    
    
}
