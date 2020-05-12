/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1;

import ElsMeusBeans.Comanda;
import ElsMeusBeans.Producte;

/**
 *
 * @author Tiffany
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llistat de productes
        Producte[] productes = {
            new Producte(1,"Portable MSI USB 3.0", 10, 3, 50),
            new Producte(2,"Portable MSI USB 2.0", 10, 3, 50),
            new Producte(3,"Font alimentacio 1000W", 10, 5, 200),
            new Producte(4,"Font alimentació 850W", 10, 4, 80),
            new Producte(5,"Ratolí", 10, 8, 20),
            new Producte(6,"Teclat gamer", 10, 4, 50),
            new Producte(7,"Monitor 20'", 10, 3, 40),
            new Producte(8,"Monitor 30'", 10, 3, 100),
            new Producte(9,"Cadira", 10, 2, 75),
            new Producte(10,"Alfombreta", 10, 9, 10)};     
        
        System.out.println("---------VENDES------------");
        for (int i = 0; i < productes.length; i++) {
            Comanda comanda = new Comanda();
        
            productes[i].addPropertyChangeListener(comanda);
            //es canvia l'estoc actual
            productes[i].setStockactual(6);
            if (comanda.isDemana()) {
                System.out.println("Fer comanda en producte: "
                + productes[i].getDescripcio());
                System.out.println("");
            }
            //saltar producte
            i++;
        }
        
        //Mostrar estocs mínims:
        System.out.println("---------ESTOCS------------");
        for (Producte producte : productes) {
            System.out.println("Estoc mínim del producte: " 
                    + producte.getDescripcio() 
                    + ": " + producte.getStockminim());
        }
        
    }
    
}
