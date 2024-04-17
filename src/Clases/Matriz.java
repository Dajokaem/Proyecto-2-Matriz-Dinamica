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
public class Matriz {

    public List<Lista> columnas = new ArrayList<Lista>();

    public Matriz() {
    }

    public void insertar(int x, int y, Nodo nuevo) {
        int i = 0;
        

        if (columnas.isEmpty()) {
         
            for (i = 0; i < x + 1; i++) {
                columnas.add(new Lista());

            }
            for (i = 0; i < y + 1; i++) {
                columnas.get(x).fila.add(null);
            }
            
            
            columnas.get(x).fila.set(y, nuevo);
        } else {
            if (columnas.size() < x + 1) {
                for (i = columnas.size() - 1; i < x + 1; i++) {
                    columnas.add(new Lista());
                }
            }
            if (columnas.get(x).fila.size() < y + 1) {
                for (i = columnas.get(x).fila.size() - 1; i < y + 1; i++) {
                    columnas.get(x).fila.add(null);
                }
            }
            columnas.get(x).fila.set(y, nuevo);
        }
        
       
    }

    public boolean esOcupado(int x, int y) {
        if (columnas.isEmpty()) {
            return false;
        } else {
            if (columnas.size() < x || columnas.get(x).fila.size() < y) {
                return false;
            } else {
                Nodo prueba = columnas.get(x).fila.get(y);
                if (prueba == null) {
                    return false;
                } else {
                    return true;
                }
            }

        }
    }

    public Nodo Buscar(int x, int y) {
        try{
        Nodo objetivo = this.columnas.get(x).fila.get(y);
        return objetivo;
        }catch(NullPointerException ex){
            System.out.println("Me diste negativos");
            System.out.println("No te doy nada");
            return null;
        }

    }

    public void BuscarPropietario(String propietario) {
        class Coord {

            public int x;
            public int y;

            Coord(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }
        int x = 0, y = 0, j = 0, i = 0;
        List<Coord> coordenadas = new ArrayList<Coord>();
 
        Lista b;
        Nodo a;
        for(i = 0; i<columnas.size();i++){
            System.out.println(i);
            b = columnas.get(i);
            for(j = 0; j<columnas.get(i).fila.size(); j++){
                System.out.println(j);
                a = b.fila.get(j);
                System.out.println(a);
                if(a!= null){
                    if(a.vehi.propietario.equals(propietario)){
                        Coord c = new Coord(i, j);
                        coordenadas.add(c);
                    }
                }
            }
        }
        if (!coordenadas.isEmpty()) {
            System.out.println("Este propietario tiene autos en las coordenadas");
            for (Coord e : coordenadas) {
                System.out.println("X: " + e.x + " Y: " + e.y);
            }
        } else {
            System.out.println("Ese propietario no tiene nigun auto");
        }

    }

    public void BuscarPlaca(String placa) {

        int x = 0, y = 0, j = 0;
        List<Coord> coordenadas = new ArrayList<Coord>();

        for (Lista temp : this.columnas) {
            for (Nodo a : temp.fila) {
                if (a != null) {
                    if (a.vehi.placa.equals(placa)) {
                        j = j + 1;
                        Coord c = new Coord(x, y);
                        coordenadas.add(c);
                    }

                }
                y++;
            }
            x++;
        }
        if (!coordenadas.isEmpty()) {
            System.out.println("La placa" + placa + " esta en las coordenadas");
            for (Coord e : coordenadas) {
                System.out.println("X: " + e.x + " Y: " + e.y);
            }
        } else {
            System.out.println("Esa placa no la tiene ningun auto");
        }

    }

    public void BuscarColor(String color) {
        class Coord {

            public int x;
            public int y;

            Coord(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }
        int x = 0, y = 0, j = 0;
        List<Coord> coordenadas = new ArrayList<Coord>();

        for (Lista temp : this.columnas) {
            for (Nodo a : temp.fila) {
                if (a != null) {
                    if (a.vehi.color.equals(color)) {
                        j = j + 1;
                        Coord c = new Coord(x, y);
                        coordenadas.add(c);
                    }

                }
                y++;
            }
            x++;
        }
        if (!coordenadas.isEmpty()) {
            System.out.println("Los autos de color " + color + " estan en las coordenadas");
            for (Coord e : coordenadas) {
                System.out.println("X: " + e.x + " Y: " + e.y);
            }
        } else {
            System.out.println("Ese color no lo tiene ningun auto");
        }

    }

    public void BuscarLinea(String linea) {
        class Coord {

            public int x;
            public int y;

            Coord(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }
        int x = 0, y = 0, j = 0;
        List<Coord> coordenadas = new ArrayList<Coord>();

        for (Lista temp : this.columnas) {
            for (Nodo a : temp.fila) {
                if (a != null) {
                    if (a.vehi.linea.equals(linea)) {
                        j = j + 1;
                        Coord c = new Coord(x, y);
                        coordenadas.add(c);
                    }

                }
                y++;
            }
            x++;
        }
        if (!coordenadas.isEmpty()) {
            System.out.println("Los autos de la linea,  " + linea + " estan en las coordenadas");
            for (Coord e : coordenadas) {
                System.out.println("X: " + e.x + " Y: " + e.y);
            }
        } else {
            System.out.println("Ningun auto pertenece a esa linea");
        }
    }

    public void BuscarModelo(String modelo) {
        class Coord {

            public int x;
            public int y;

            Coord(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }
        int x = 0, y = 0, j = 0;
        List<Coord> coordenadas = new ArrayList<Coord>();

        for (Lista temp : this.columnas) {
            for (Nodo a : temp.fila) {
                if (a != null) {
                    if (a.vehi.modelo.equals(modelo)) {
                        j = j + 1;
                        Coord c = new Coord(x, y);
                        coordenadas.add(c);
                    }

                }
                y++;
            }
            x++;
        }
        if (!coordenadas.isEmpty()) {
            System.out.println("Los autos de modelo,  " + modelo + " estan en las coordenadas");
            for (Coord e : coordenadas) {
                System.out.println("X: " + e.x + " Y: " + e.y);
            }
        } else {
            System.out.println("Ningun auto es este modelo");
        }
    }

    public void Eliminar(int x, int y) {
        Nodo vacio = null;
        this.columnas.get(x).fila.set(y, vacio);
        System.out.println("Este aparcamiento ha sido liberado");
    }
}
