package Capitulo_04.Laboratorios;

import java.util.Scanner;

public class Laboratorio_1 {

    public static void main(String[] args){
    	
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número a ser verificado: ");
        int numero = s.nextInt();
	    s.close();
        
        if(numero == 0 || numero == 1){
        	System.out.println("\nO número " + numero + " não é considerado um primo!");
        }
        else{
            int x = 0;
            
        	for(int i = numero; i > 0; i--){
        		if(numero % i == 0){
        			x++;
    			}
        	}
        	
        	// declarando um array que armazenará os divisores de um número
        	int[] divisores = new int[x];
        	int z = 0;
        	
        	for(int i = numero; i > 0; i--){
        		if(numero % i == 0){
        			divisores[z] = numero / i;
        			z++;
        		}
        	}
        	
            if(x > 2){
            	System.out.print("\nO número " + numero + " não é primo pois possui " + x + " divisores! São eles: ");
        		int cont = 0;
            	for (z = 0; z < x; z++) {
            		cont++;
            		System.out.print(divisores[z]);
            		if(cont < x) {
            			System.out.print(", ");
            		}
            		else {
            			System.out.print(".");
            		}
            	}
            }
            else{
            	System.out.println("\nO número " + numero + " é primo pois possui apenas " + x + " divisores, o número \'1\' e ele mesmo");
            }
		}
    }

}