/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfactory;

/**
 *
 * @author Admin
 */
public class ConcreteCreatorB  extends Creator{

    @Override
    public Product createProduct() {
      return new ProductoContrete2();
    }
    
}
