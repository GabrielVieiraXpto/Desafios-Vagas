/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Fibonacci 
{


    public static void main(String[] args) 
    {
        //2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valoresanteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        System.out.println("Verificador de numeros presentes na sequência de Fibonacci"); 
        calcularFibonacci(entradaTratamento());       
    }
    
    static int entradaTratamento()
    {
        Scanner read=new Scanner(System.in);
        int valor=1;
        
        boolean verifica=false;
        
        while(verifica==false)
        {
            try
            {
                System.out.print("Digite um valor: ");
                valor=Integer.parseInt(read.nextLine());
                verifica=true;
                if(valor<0)
                {
                    System.out.println("valores negativos não fazem parte da sequencia Fibonacci");
                    verifica=false;
                }
            }
            catch(RuntimeException x)
            {
                System.out.println("valor invalido");
            } 
        }
        
        return valor;
    }
    
    static void calcularFibonacci(int x)
    {
        int total=1;
        int y1=0;
        
        System.out.print("[0,1");
        while(total <=x)
        {
            total=y1+total;
            y1=total-y1;
            
            System.out.print(","+total);
        }
            System.out.print("]");
               
        if(x==y1)
        {
               System.out.println("\n o valor "+x+" pertence a sequencia de Fibonacci"); 
        }
        else
        {
           System.out.println("\n o valor "+x+" não pertence a sequencia de Fibonacci"); 
        }

    }
    
}
