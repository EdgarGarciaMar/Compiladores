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
            while (indice <= arr1.length) {
                if (arr1.length == 2) {//IF
                    if ('i' == arr1[indice]) {
                        indice++;
                        if ('f' == arr1[indice]) {
                            System.out.println("Palabra aceptada: {if}");
                            break;
                        }
                    }
                }
                if(arr1.length ==4){//ELSE
                    
                }
                
                if(arr1.length==5){
                    
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
