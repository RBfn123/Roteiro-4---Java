package Respostas;

import java.util.Scanner; 

public class R4questão2 {

//2 - Construa um programa que leia 10 números e informe a soma total

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0; 
		
	for (int i = 1; i <= 10; i++) {
		System.out.println("digite um numero: "); 
		int numero = sc.nextInt(); 
		
	soma += numero; 
	System.out.println("Soma total: " + soma); 
	   }

	}
    
}