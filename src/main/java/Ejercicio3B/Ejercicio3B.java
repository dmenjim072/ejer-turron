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
            ("Introduce el precio de la materia prima del producto"));
            materiaPrima = Double.parseDouble(precioMatPrimaString);
            
            if (materiaPrima>=LIMITE_INFERIOR && materiaPrima<=LIMITE_SUPERIOR){
                //algoritmo
                 switch (codProducto){
            case "M1":
                // Proceso unitario coste produccion y precio venta de M1
                double costeProdM1 = MANO_OBRA_M1_T1 + materiaPrima;
                JOptionPane.showConfirmDialog(null, "El coste de "
                        + "produccion unitario es: " + costeProdM1 + "€");
                
                double precioVentaM1 = costeProdM1 + (BENEFICIO_M1_M2_P1 * costeProdM1);
                JOptionPane.showConfirmDialog(null, "El precio de "
                        + "venta unitario es: " + precioVentaM1 + "€");
                
                double m1Necesarios = BENEFICIO_VENTAS / precioVentaM1;
                JOptionPane.showConfirmDialog(null, 
                        "La cantidad de mantecados de limon necesarios para llegar "
                                + "a 2500€ son" + m1Necesarios);
                break;
                
            case "M2":
                 // Proceso unitario coste produccion y precio venta de M2
                double costeProdM2 = MANO_OBRA_M2_T2_P1 + materiaPrima;
                JOptionPane.showConfirmDialog(null, "El coste de "
                        + "produccion unitario es: " + costeProdM2 + "€");
                
                double precioVentaM2 = costeProdM2 + (BENEFICIO_M1_M2_P1 * costeProdM2);
                JOptionPane.showConfirmDialog(null, "El precio de "
                        + "venta unitario es: " + precioVentaM2 + "€");
                
                double m2Necesarios = BENEFICIO_VENTAS / precioVentaM2;
                JOptionPane.showConfirmDialog(null, 
                        "La cantidad de mazapanes necesarios para llegar "
                                + "a 2500€ son" + m2Necesarios);
                break;
                
            case "P1":
                 // Proceso unitario coste produccion y precio venta de P1
                double costeProdP1 = MANO_OBRA_M2_T2_P1 + materiaPrima;
                JOptionPane.showConfirmDialog(null, "El coste de "
                        + "produccion unitario es: " + costeProdP1 + "€");
                
                double precioVentaP1 = costeProdP1 + (BENEFICIO_M1_M2_P1 * costeProdP1);
                JOptionPane.showConfirmDialog(null, "El precio de "
                        + "venta unitario es: " + precioVentaP1 + "€");
                
                double p1Necesarios = BENEFICIO_VENTAS / precioVentaP1;
                JOptionPane.showConfirmDialog(null, 
                        "La cantidad de polvorones necesarios para llegar "
                                + "a 2500€ son" + p1Necesarios);
                break;
                
            case "T1":
                 // Proceso unitario coste produccion y precio venta de T1
                double costeProdT1 = MANO_OBRA_M1_T1 + materiaPrima;
                JOptionPane.showConfirmDialog(null, "El coste de "
                        + "produccion unitario es: " + costeProdT1 + "€");
                
                double precioVentaT1 = costeProdT1 + (BENEFICIO_T1_T2 * costeProdT1);
                JOptionPane.showConfirmDialog(null, "El precio de "
                        + "venta unitario es: " + precioVentaT1 + "€");
                
                double t1Necesarios = BENEFICIO_VENTAS / precioVentaT1;
                JOptionPane.showConfirmDialog(null, 
                        "La cantidad de turrones de chocolate necesarios para "
                                + "llegar a 2500€ son" + t1Necesarios);
                break;
                
            case "T2":
                 // Proceso unitario coste produccion y precio venta de T2
                double costeProdT2 = MANO_OBRA_M2_T2_P1 + materiaPrima;
                JOptionPane.showConfirmDialog(null, "El coste de "
                        + "produccion unitario es: " + costeProdT2 + "€");
                
                double precioVentaT2 = costeProdT2 + (BENEFICIO_T1_T2 * costeProdT2);
                JOptionPane.showConfirmDialog(null, "El precio de "
                        + "venta unitario es: " + precioVentaT2 + "€");
                
                double t2Necesarios = BENEFICIO_VENTAS / precioVentaT2;
                JOptionPane.showConfirmDialog(null, 
                        "La cantidad de turrones clasicos necesarios para llegar "
                                + "a 2500€ son" + t2Necesarios);
                break;            
        }    
            // En caso de que se escriba mal el precio de la materia    
            } else {
                JOptionPane.showConfirmDialog(null,
                        "El precio de la materia no es correcto");
            }
        // En caso de que se escriba mal el codigo del producto    
        } else {
            JOptionPane.showConfirmDialog(null,
                        "El codigo introducido no es correcto");
        }
                                                              
           
    }
}
