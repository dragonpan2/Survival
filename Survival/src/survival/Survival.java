/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author panbe
 */
public class Survival {

    public static Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) {
        int selection1; 
        int selectedItem = 0;
        
        
        Player player = new Player("amba", 100, 100, 100, 100, 100, 100, 100, 100);
        
        Consumable MRE = new Consumable(0, 50, 1, "MRE", 0, "Meal Ready To Eat");
        Consumable MRE1 = new Consumable(0, 50, 1, "MRE", 0, "Meal Ready To Eat");
        
        
        
        ArrayList<Item> Inventory = new ArrayList();
        Inventory.add(MRE);
        Inventory.add(MRE);
        
        
        //-------------------------------------
        
        System.out.println(player.getName()+"'s stats");
        System.out.println(player.getHunger()+"/"+player.getMaxHunger()+" Hunger");
        System.out.println(player.getHealth()+"/"+player.getMaxHealth()+" Health");
        System.out.println(player.getThrist()+"/"+player.getMaxThrist()+" Thrist");
        System.out.println(player.getEnergy()+"/"+player.getMaxEnergy()+" Energy");
        
        
        
        System.out.println("1- Inventory");
        System.out.println("");
        System.out.println("");
        switch (getInt(1)) {
            case 1:
                checkInventory(Inventory);
                selectedItem = getInt(Inventory.size());
               
                Consumable temp = new Consumable();
                
                temp = (Consumable) Inventory.get(selectedItem);
                
//                System.out.println(Inventory.get(selectedItem).getName());
//                System.out.println(Inventory.get(selectedItem).getDescription());
                System.out.println(((Consumable)Inventory.get(selectedItem)).getAddHunger());
                
                ((Consumable)Inventory.get(selectedItem)).getAddHunger();
                
                System.out.println(temp.getName());
                System.out.println(temp.getDescription());
                System.out.println(temp.getAddHunger());
                
                if (Inventory.get(selectedItem) instanceof Consumable) {
                    System.out.println("-0 do nothing");
                    System.out.println("-1 consume");
                    switch (getInt(1)) {
                        case 0:
                            break;
                        case 1:
                            player.setHunger(player.getHunger()+temp.getAddHunger());
                            Inventory.remove(selectedItem);
                            
                            break;
                    }
                }
                
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                
        }
        
        
        System.out.println(player.getName()+"'s stats");
        System.out.println(player.getHunger()+"/"+player.getMaxHunger()+" Hunger");
        System.out.println(player.getHealth()+"/"+player.getMaxHealth()+" Health");
        System.out.println(player.getThrist()+"/"+player.getMaxThrist()+" Thrist");
        System.out.println(player.getEnergy()+"/"+player.getMaxEnergy()+" Energy");
        
    }
    
    public static int getInt(int max) {
        String chaine; //Chaine qui reçoit la réponse
        int choix = 0; //Int qui correspond au choix de l'utilisateur
        boolean erreur; //Boolean qui permet la redemande du choix de l'utilisateur
        do {//Ce do while continue tant que l'utilisateur écrire pas ce qui est demandé
            erreur = false;
            chaine = SCAN.nextLine();
            try {
                choix = Integer.parseInt(chaine);

            } catch (NumberFormatException e) {//Si autre chose que des nombres est présent dans chaîne
                System.out.println("Vous avez écrit des caratères non-numériques.");
                erreur = true;
            }

            if ((choix < 1 || choix > max) && erreur == false) {
                //Si le choix est plus grand que le max ou plus petit que 1
                System.out.println("Vous avez écrit une valeur qui n'est pas permise (entre " + 1 + " et " + max + ")");
                erreur = true;
            }

            if (erreur) {
                //Si une faute est commise
                System.out.println("Veuillez retaper votre réponse.");
            }

        } while (erreur);
        
        return choix;

    }
    
    public static void checkInventory(ArrayList<Item> Inventory) {
        for (int i = 0; i < Inventory.size(); i++) {
          //  System.out.println(i+" "+ Inventory.get(i));
//            Inventory.get(i).printStat;
            Inventory.get(i).getName();
            Inventory.get(i).getDescription();
            printItem(Inventory.get(i));
        }
    }
    
    public static void printItem(Consumable consumable) {
        System.out.println(consumable.getAddHunger() +"Hunger");
    }
    
    public static void playerStat(Player player) {
        System.out.println(player.getName()+"'s stats");
        System.out.println(player.getHunger()+"/"+player.getMaxHunger()+" Hunger");
        System.out.println(player.getHealth()+"/"+player.getMaxHealth()+" Health");
        System.out.println(player.getThrist()+"/"+player.getMaxThrist()+" Thrist");
        System.out.println(player.getEnergy()+"/"+player.getMaxEnergy()+" Energy");
        
    }
    
    
    
}
