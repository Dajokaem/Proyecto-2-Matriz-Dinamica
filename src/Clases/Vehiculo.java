/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jos56
 */
public class Vehiculo {

    public String placa;
    public String color;
    public String linea;
    public String modelo;
    public String propietario;

    public Vehiculo(String placa, String color, String linea, String modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public void imprimir(){
        System.out.println("Datos del Vehiculo: ");
        System.out.println("Propietario: "+this.propietario);
        System.out.println("Placa: "+this.placa);
        System.out.println("Color: "+this.color);
        System.out.println("Linea: "+this.linea);
        System.out.println("Modelo: "+this.modelo);
        
    }
}
