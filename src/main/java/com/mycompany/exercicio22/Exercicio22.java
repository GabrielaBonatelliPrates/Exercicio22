

package com.mycompany.exercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio22 {

    public static void main(String[] args) {        
        double soma = 0;
        double i = 0;
        while (i <= 1000) {
            soma = soma + i;
            i = i++;
        }
    
    JOptionPane.showMessageDialog (null, soma/1000);
    }

}
