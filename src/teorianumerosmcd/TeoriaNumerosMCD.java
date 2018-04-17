/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorianumerosmcd;

import javax.swing.JOptionPane;

/**
 *
 * @author TICSCI
 */
public class TeoriaNumerosMCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                 TeoriaNumerosMCD mcd = new TeoriaNumerosMCD();

                    int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));  
                    mcd.MaximoComunDivisor(c, d);
                
        // TODO code application logic here
    }
    
        public int MaximoComunDivisor (int c, int d){
   
        while ( d != 0 ){
            int t =d;
            d = c % d ;
            c = t ;
            
        }
            JOptionPane.showMessageDialog(null, "El MDC es : \n" + c,"MAXIMO COMUN DIVISOR",JOptionPane.INFORMATION_MESSAGE); 
            return c ;
    } 
    
}
