package com.generation.diferencaIdadeMae;

import java.util.Scanner;

/**
 * Calcula diferença entre sua idade e de sua Mãe.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner ler1 = new Scanner(System.in);
        
    	System.out.println( "Digite sua idade: " );
    	int idadef = ler1.nextInt();
        
    	System.out.println("E a idade da mamãe: ");
    	int idadem = ler1.nextInt();
    
    	int calculo = idadem - idadef;
    	
    	System.out.printf("A diferença de idade entre vocês é de " + calculo +" anos !");
    	
    }
  
    
}
