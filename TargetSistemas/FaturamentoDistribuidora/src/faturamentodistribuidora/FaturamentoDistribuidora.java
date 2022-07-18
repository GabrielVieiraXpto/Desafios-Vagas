/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faturamentodistribuidora;

/**
 *
 * @author Gabriel
 */
public class FaturamentoDistribuidora 
{

    public static void main(String[] args) 
    {
        /*
        4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

        SP – R$67.836,43
        RJ – R$36.678,66
        MG – R$29.229,88
        ES – R$27.165,48
        Outros – R$19.849,53

        Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
        */
        
        Distribuidoras sp=new Distribuidoras("sp",67836.43);
        Distribuidoras rj=new Distribuidoras("rj",36678.66);
        Distribuidoras mg=new Distribuidoras("mg",29229.88);
        Distribuidoras es=new Distribuidoras("es",27165.48);
        Distribuidoras outros=new Distribuidoras("outros",19849.53); 
        
        System.out.println("faturamento mensal de uma distribuidora");
        System.out.println("|Estado\t|Faturamento\t|Percentual\t|");
        System.out.printf("|%s\t| R$ %.2f\t| %.2f%%\t|\n",sp.uf,sp.faturamento,sp.percentual());
        System.out.printf("|%s\t| R$ %.2f\t| %.2f%%\t|\n",rj.uf,rj.faturamento,rj.percentual());
        System.out.printf("|%s\t| R$ %.2f\t| %.2f%%\t|\n",mg.uf,mg.faturamento,mg.percentual());
        System.out.printf("|%s\t| R$ %.2f\t| %.2f%%\t|\n",es.uf,es.faturamento,es.percentual());
        System.out.printf("|%s\t| R$ %.2f\t| %.2f%%\t|\n\n",outros.uf,outros.faturamento,outros.percentual());
        
        System.out.println("Valor total: "+Distribuidoras.total);
     
    }
   
}
