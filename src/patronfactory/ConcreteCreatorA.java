/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfactory;

/**
 *
 * @author Admin
 */
public class ConcreteCreatorA extends Creator{

    @Override
    public Product createProduct() {
        Product product = new ProductConcrete1();
        return product;
    }
    
}
