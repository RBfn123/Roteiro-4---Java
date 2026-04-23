package Respostas;

import java.util.Scanner;

public class R4questão1 {

// 1 - Construa um programa que leia 10 números e informe, para cada um deles, se é par ou
//ímpar.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	for (int i = 1; i <= 10; i++) {
		System.out.println("digite um numero: "); 
		int numero = sc.nextInt(); 
		
		if (numero % 2 == 0) {
			System.out.println("par");
		}else { 
			System.out.println("impar"); 

			
		}
      }
	}

}
