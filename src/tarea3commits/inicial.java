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
    
    public inicial() {

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
     public void menuUsuarios() {
        System.out.println("   Menu Usuarios");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar todos los Usuarios");
        System.out.println("3. usuario personalizado");
        System.out.println("4. Menu Principal");
        System.out.println("5. Salir");
        lector = new Scanner(System.in);
        int numero ;
        switch (numero = lector.nextInt()) {
            case 1:
               IngresarUsuario();
                break;
                
            case 2:
                    mostrarUsuario();
               break;     
               
            case 3:
                usuarioPersonalizado();     
            break;
            
            case 4:
                menuPrincipal();
                break;
            case 5:
                            System.exit(0);
                            break;
            default:
        }
    }
    private void IngresarUsuario() {
        System.out.println("hola");
        int t = 0;
        while (t < 5) {
            System.out.println("Ingresar Usuario:");
            Scanner lector2 = new Scanner(System.in);
            String nombre = lector2.nextLine();
            nombres1[t] =nombre;
            t++;
        }
        for (int l=0;l<5;l++){
            System.out.println(nombres1[l]);
                 menuUsuarios(); 
        }   
    }
     public void usuarioPersonalizado(){
         
         System.out.println("ingrese un usuario");
      
        boolean encontrado = false;
        Scanner S = new Scanner(System.in);
        String nombreingresado = S.nextLine();
        int s = 0;
        while (s < nombres1.length && !encontrado) {
            if (nombreingresado.equals(nombres1[s])) {
                System.out.println(nombres1[s]);
                encontrado = true;
            }
            s++;       
            }
        if (!encontrado) {
            System.out.println("Usuario no encontrado");
             menuUsuarios();
     } 
     }
     
            public void mostrarUsuario(){
          System.out.println("Mostrar Todos los usuarios");
                            for (int i = 0; i < 5; i++) {
                                System.out.println( nombres1 [i]);}
     menuUsuarios();         
}
public void menuPalindromas(){ 
    
}
}
