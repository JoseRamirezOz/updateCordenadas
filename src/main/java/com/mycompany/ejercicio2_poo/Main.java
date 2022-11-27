package com.mycompany.ejercicio2_poo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Controlador usuario = new Controlador();
        
        int response;
        do{
            response = Integer.parseInt(JOptionPane.showInputDialog("Escoje una opción: "
                + "\n 8. Arriba \n 2. Abajo \n 4. Izquierda \n 6. Derecha \n 0. Salir"));
            
            switch (response) {
                case 6:
                    usuario.derecha();
                    System.out.println("Cordenadas actuales " + "x= " +usuario.getPosicionA()+"," + "y= " +usuario.getPosicionB());
                    break;
                case 2: 
                    usuario.abajo();
                    System.out.println("Cordenadas actuales " + "x= " +usuario.getPosicionA()+"," + "y= " +usuario.getPosicionB());
                    break;
                case 4:
                    usuario.izquierda();
                    System.out.println("Cordenadas actuales " + "x= " +usuario.getPosicionA()+"," + "y= " +usuario.getPosicionB());
                    break;
                case 8:
                    usuario.arriba();
                    System.out.println("Cordenadas actuales " + "x= " +usuario.getPosicionA()+"," + "y= " +usuario.getPosicionB());
                    break;
                default:
                    System.out.println("Valida tu opcion");
            }
            
        }while(response != 0);
    }
}
