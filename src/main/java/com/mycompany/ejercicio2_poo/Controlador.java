package com.mycompany.ejercicio2_poo;

import javax.swing.JOptionPane;

public class Controlador {
    //Atributos 
    private int posicionA = 0;
    private int posicionB = 0;

    // Getters and Setters 
    public int getPosicionA() {
        return posicionA;
    }

    public void setPosicionA(int posicionA) {
        this.posicionA = posicionA;
    }

    public int getPosicionB() {
        return posicionB;
    }

    public void setPosicionB(int posicionB) {
        this.posicionB = posicionB;
    }
    
    //Metodos
    public void arriba(){
        if(posicionB > 0){
            posicionB--;
        }else{
            JOptionPane.showMessageDialog(null, "Te encuentras en las cordenadas: " + this.posicionA + "," + this.posicionB + "No puedes ir de forma negativa en el eje y");
        }
    }
    
    public void abajo(){
        posicionB++;
    }
    
    public void izquierda(){
        if(posicionA > 0){
            posicionA--;
        }else{
            JOptionPane.showMessageDialog(null, "Te encuentras en las cordenadas: " + this.posicionA + "," + this.posicionB + "No puedes ir de forma negativa en el eje x");
        }
    }
    
    public void derecha(){
        posicionA++;
    }
}
