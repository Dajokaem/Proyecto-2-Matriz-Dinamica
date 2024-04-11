/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jos56
 */
public class Lista {
    public List<Nodo> fila = new ArrayList<Nodo>();

    public Lista() {
    }
    
    public void add(Nodo e){
        fila.add(e);
    }

    public List<Nodo> getFila() {
        return fila;
    }

    public void setFila(List<Nodo> fila) {
        this.fila = fila;
    }
    public int size(){
        return this.fila.size();
    }
    
}
