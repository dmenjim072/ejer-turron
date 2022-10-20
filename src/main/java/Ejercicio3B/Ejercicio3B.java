/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio3B;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejercicio3B {

    public static void main(String[] args) {
        
        //Declaramos variables (mano de obra y beneficio por unidad y por ventas)
        final double MANO_OBRA_M1_T1 = 0.15;
        final double MANO_OBRA_M2_T2_P1 = 0.22;
        
        final double BENEFICIO_M1_M2_P1 = 0.5;  // 50%
        final double BENEFICIO_T1_T2 = 0.65;    // 65%
        
        final double BENEFICIO_VENTAS = 2500;
        
        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;
        
        double materiaPrima = 0;
        
        // Entradas con JOption (codigo del dulce y precio materia prima)
        String codProducto = JOptionPane.showInputDialog("Introduce el codigo: \n"
                + "M1 (mantecados de limon)\n"
                + "M2 (mazapanes)\n"
                + "P1 (polvorones)\n"
                + "T1 (turron de chocolate)\n"
                + "T2 (turron clasico)");
        codProducto = codProducto.toUpperCase();
        
        
        
        
        if (codProducto.equals("M1")||codProducto.equals("M2")
        ||codProducto.equals("T1")||codProducto.equals("T2")
        ||codProducto.equals("P1")){
            // algoritmo del producto
            // Entrada de precio materia prima con JOption y lo pasamos a double
            String precioMatPrimaString = (JOptionPane.showInputDialog
            ("Introduce el precio de la materia prima"));
            materiaPrima = Double.parseDouble(precioMatPrimaString);
            
            if (materiaPrima>=0.1 && materiaPrima<=1) {
                //algoritmo
                 switch (codProducto){
            case "M1":
                break;
            case "M2":
                break;
            case "P1":
                break;
            case "T1":
                break;
            case "T2":
                break;            
        }    
                
            } else {
                JOptionPane.showConfirmDialog(null,
                        "El precio de la materia no es correcto");
            }
        } else {
            JOptionPane.showConfirmDialog(null,
                        "El codigo introducido no es correcto");
        }
            
                
       //Procesos
        
        
        
       
        
        
        
           
    }
}
