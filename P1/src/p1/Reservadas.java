/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author edgargarcia
 */
public class Reservadas {

    char arr1[];

    public Reservadas(char arr[]) {
        this.arr1 = arr;
    }

    public void identificarPalabra() {
        int indice = 0;
        int bandera = 0;
        while (indice <= arr1.length) {
            if (arr1.length == 2) {//IF
                if ('i' == arr1[indice]) {
                    indice++;
                    if ('f' == arr1[indice]) {
                        System.out.println("Palabra aceptada: {if}");
                        bandera =1;
                        break;
                    } else {
                        System.out.println("Palabra no aceptada: {if}");
                    }
                }
            }
            if (arr1.length == 4) {//ELSE
                if ('e' == arr1[indice]) {
                    indice++;
                    if ('l' == arr1[indice]) {
                        indice++;
                        if ('s' == arr1[indice]) {
                            indice++;
                            if ('e' == arr1[indice]) {
                                System.out.println("Palabra aceptada: {else}");
                                bandera =1;
                                break;
                            } else {
                                System.out.println("Palabra no aceptada: {else}");
                                break;
                            }
                        }
                    }
                }
            }

            if (arr1.length == 6) {//return
                if ('r' == arr1[indice]) {
                    indice++;
                    if ('e' == arr1[indice]) {
                        indice++;
                        if ('t' == arr1[indice]) {
                            indice++;
                            if ('u' == arr1[indice]) {
                                indice++;
                                if ('r' == arr1[indice]) {
                                    indice++;
                                    if ('n' == arr1[indice]) {
                                        System.out.println("Palabra aceptada: {return}");
                                        bandera =1;
                                        break;
                                    } else {
                                        System.out.println("Palabra no aceptada: {return}");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(bandera == 0){
                System.out.println("Palabra no aceptada");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Reservadas tm;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String cadena = entrada.nextLine();
        char arr[] = cadena.toCharArray();
        System.out.println(arr.length);
        tm = new Reservadas(arr);
        tm.identificarPalabra();
    }

}
