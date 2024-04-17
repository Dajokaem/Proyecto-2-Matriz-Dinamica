/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esta2;

import Clases.Matriz;
import Clases.Nodo;
import java.util.Scanner;
import Clases.Vehiculo;

/**
 *
 * @author jos56
 */
public class Esta2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matriz estacionamiento = new Matriz();
        int op = 99, x, y;
        do {
            try {
                menu();

                op = leer.nextInt();

                switch (op) {
                    case 1:
                        Vehiculo v = new Vehiculo();
                        Nodo n = new Nodo();
                        System.out.println("Ok, Dame los datos del vehiculo");
                        System.out.println("Quien es el propietario?");
                        v.setPropietario(leer.next());
                        System.out.println("Dame la placa");
                        v.setPlaca(leer.next());
                        System.out.println("Dame el color");
                        v.setColor(leer.next());
                        System.out.println("Dame la linea");
                        v.setLinea(leer.next());
                        System.out.println("Dame el modelo");
                        v.setModelo(leer.next());
                        System.out.println("Gracias, dame la coordenadas donde quieres estacionarlo");
                        do {
                            System.out.println("La coordenada horizontal es?");
                            System.out.print("X: ");
                            x = leer.nextInt();
                            System.out.print("Y: ");
                            System.out.println("Y la vertical?");
                            y = leer.nextInt();
                            System.out.println("Gracias, procedere a comprobar si esta ocupado");
                            if (x < 0 || y < 0) {
                                System.out.println("Me diste negativos");
                                System.out.println("Dame otras coordenadas");
                            } else {
                                if (estacionamiento.esOcupado(x, y)) {
                                    System.out.println("Este espacio esta ocupado");
                                    System.out.println("Dame otras coordenadas");
                                } else {
                                    System.out.println("Este espacio esta libre");
                                    System.out.println("Lo insertare");
                                    n.setVehi(v);
                                    estacionamiento.insertar(x, y, n);
                                    System.out.println("Ya fue insertado1");

                                    break;
                                }
                            }
                        } while (estacionamiento.esOcupado(x, y));

                        break;
                    case 2:
                        int busqueda = 999;
                        do {
                            System.out.println("Buscar, ok, Que tipo de busqueda quieres?");
                            System.out.println("1. Buscar coordenadas, (dame la informacion y te dare las coordenadas donde se encuentra)");
                            System.out.println("2. Buscar informacion, (dame las coordenadas y te doy la informacion de lo que se encuentra ahi)");
                            System.out.println("0. Regresar al menu principal");
                            busqueda = leer.nextInt();
                            switch (busqueda) {
                                case 1:
                                    int informacion = 99;
                                    System.out.println("Ok, que quieres usar para encontrar las coordenadas");
                                    System.out.println("1. Por placa");
                                    System.out.println("2. Por color, (recuerda que si varios autos tienen el mismo color, te dare todas las coordenadas donde se encuentre este color)");
                                    System.out.println("3. Por linea, (lo mismo que en color, si hay varios, te doy varios");
                                    System.out.println("4. Modelo, (lo mismo)");
                                    System.out.println("5. Propietario, (lo mismo)");
                                    System.out.println("0. Regresar al menu anterior");
                                    informacion = leer.nextInt();
                                    String nada = "";
                                    switch (informacion) {
                                        case 1:
                                            System.out.println("Ok, dame la placa");
                                            nada = leer.next();
                                            estacionamiento.BuscarPlaca(nada);
                                            break;
                                        case 2:
                                            System.out.println("Ok, dame el color");
                                            nada = leer.next();
                                            estacionamiento.BuscarColor(nada);
                                            break;
                                        case 3:
                                            System.out.println("Ok, dame la linea");
                                            nada = leer.next();
                                            estacionamiento.BuscarLinea(nada);
                                            break;
                                        case 4:
                                            System.out.println("Ok, dame el Modelo");
                                            nada = leer.next();
                                            estacionamiento.BuscarModelo(nada);
                                            break;
                                        case 5:
                                            System.out.println("Ok, dame el Propietario");
                                            nada = leer.next();
                                            estacionamiento.BuscarPropietario(nada);
                                            break;
                                        default:
                                            System.out.println("opcion invalida");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Ok, Dame las coordenadas");
                                    System.out.print("X: ");
                                    x = leer.nextInt();
                                    System.out.print("Y: ");
                                    y = leer.nextInt();
                                    estacionamiento.Buscar(x, y);

                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                        } while (busqueda != 0);
                        break;
                    case 3:
                        System.out.println("Ok, dame las coordenadas");
                        System.out.print("X: ");
                        x = leer.nextInt();
                        System.out.print("Y: ");
                        y = leer.nextInt();
                        if (x < 0 || y < 0) {
                            System.out.println("Me diste negativos");
                            System.out.println("No borro nada");
                        } else {
                            if (estacionamiento.esOcupado(x, y)) {
                                System.out.println("Gracias, lo eliminare");
                                estacionamiento.Eliminar(x, y);
                            } else {
                                System.out.println("Ese espacio no esta ocupado");
                                System.out.println("No borrare nada");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Ok, ten un buen dia");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("No ingreses letras donde se te pide numeros");
                System.out.println(ex);
                break;
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("Que quieres hacer?");
        System.out.println("1. Estacionar un vehiculo");
        System.out.println("2. Bucar un Vehiculo");
        System.out.println("3. Eliminar un vehiculo");
        System.out.println("0. Salir");
    }
}
