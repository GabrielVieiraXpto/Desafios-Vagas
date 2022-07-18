/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faturamentodistribuidora;

/**
 *
 * @author Gabriel
 */
public class Distribuidoras 
{
    double faturamento;
    String uf;
    static double total;
    
    Distribuidoras(String uf, double faturamento)
    {
        this.uf=uf;
        this.faturamento=faturamento;
        total=total+faturamento;
    }
    double percentual()
    {
        return (faturamento*100)/total;
    }
}
