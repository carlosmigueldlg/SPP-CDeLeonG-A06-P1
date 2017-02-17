/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a06.p2;
import java.util.Scanner;
/**
 *
 * @author Carlos Miguel De Leon Garcia A01410399 IMA
 */
public class SPPCDeLeonGA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner kb= new Scanner (System.in);
        int num;
        int suma=0;
        num=solicitarDatos();
        
        while(num>0){
            suma= calcularSuma(suma, num);
            num=solicitarDatos();
        }
        
        System.out.println("El resultado de la suma es:" +suma);
    }
    static int solicitarDatos() {
        Scanner kb= new Scanner (System.in);
        int num;
        
        System.out.println("Introduce un numero: ");
        try {
        num= kb.nextInt();
        }
        catch (Exception e){
        System.out.println("Esto no es un numero entero");
        num=0;
        }
        return num;
        }
           
    static int calcularSuma(int suma, int num){
        suma= suma+num;
        return suma;
    }
}

