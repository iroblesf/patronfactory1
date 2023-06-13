/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfactory;

/**
 *
 * @author Admin
 */
public class PatronFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Creator create = new ConcreteCreatorA();
        create.createProduct();
        
        Creator create1 = new ConcreteCreatorB();
        create.createProduct();
    
    }
    
}
