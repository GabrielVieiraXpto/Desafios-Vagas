/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertestrings;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class InverteStrings 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*
            5) Escreva um programa que inverta os caracteres de um string.

            IMPORTANTE:
            a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
            b) Evite usar funções prontas, como, por exemplo, reverse;
        */
            
        String texto;
        String textoInvertido=new String();
        Scanner read=new Scanner(System.in);
        
        System.out.println("Inversor de Texto");
        System.out.print("Digite uma palavra ou texto: ");
        texto=read.nextLine();  
        
        for(int x=1; x<=texto.length();x++)
        {
            textoInvertido=textoInvertido+texto.substring(texto.length()-x,texto.length()-x+1); 
        }
        System.out.println("texto invertido: "+textoInvertido);
        
    }
    
}
