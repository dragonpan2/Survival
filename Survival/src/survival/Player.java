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
public class Player {
    private String name;
    private int health;
    private int maxHealth;
    private int hunger;
    private int maxHunger;
    private int thrist;
    private int maxThrist;
    private int energy;
    private int MaxEnergy;

    public Player(String name, int health, int maxHealth, int hunger, int maxHunger, int thrist, int maxThrist, int energy, int MaxEnergy) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.hunger = hunger;
        this.maxHunger = maxHunger;
        this.thrist = thrist;
        this.maxThrist = maxThrist;
        this.energy = energy;
        this.MaxEnergy = MaxEnergy;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHunger() {
        return hunger;
    }

    public int getMaxHunger() {
        return maxHunger;
    }

    public int getThrist() {
        return thrist;
    }

    public int getMaxThrist() {
        return maxThrist;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return MaxEnergy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setMaxHunger(int maxHunger) {
        this.maxHunger = maxHunger;
    }

    public void setThrist(int thrist) {
        this.thrist = thrist;
    }

    public void setMaxThrist(int maxThrist) {
        this.maxThrist = maxThrist;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setMaxEnergy(int MaxEnergy) {
        this.MaxEnergy = MaxEnergy;
    }
    
    
    
    
    
    
    
    
}
