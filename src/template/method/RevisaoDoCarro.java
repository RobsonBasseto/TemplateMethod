/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method;

/**
 *
 * @author rr
 */
public abstract class RevisaoDoCarro {
    
    final void RevisaoDiaria(){
        RevisarMotor();
        RevisarPneus();
        Abastecer();
    }
    abstract void RevisarMotor();
    abstract void RevisarPneus();
    
    final void Abastecer(){
        System.out.println("Abastecendo");
    }
}
