/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3commits;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class inicial {
    
    public tt() {

        menuPrincipal();
    }
    Scanner lector;
    //Scanner lector2;
    String[] nombres1 = new String[5];


    public void menuPrincipal() {
    System.out.println("tarea3");
        System.out.println("201602502");

        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palindromas");
        System.out.println("3. Salir");
        lector = new Scanner(System.in);
        try {
            int numero = lector.nextInt();
            switch (numero) {

                case 1:
                   menuUsuarios();
                    break;
                case 2:
                    menuPalindromas();
                   

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Caracter invalido x1");
                    menuPrincipal();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Caracter invalido x2");
            menuPrincipal();
        }
    }
    
}
