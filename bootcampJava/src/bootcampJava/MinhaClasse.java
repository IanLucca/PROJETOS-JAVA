package bootcampJava;

import java.util.Scanner;

import javax.management.Query;

import aulasVariaveis.SmartTv;

public class MinhaClasse {

	public static void main(String[] args) {
		int numeroteste = 20;
		int numeroteste2 = 19;
	//	System.out.println(verificacaonumeroteste(numeroteste, numeroteste2));
		// ComparacaoAvancada.java
		int numero1 = 1;
		int numero2 = 1;
		boolean ligada; 
		int canal, volume;
		volume = 10;

	//	if (++ numero1== 2 && ++ numero2 == 2 ) {
	//	    System.out.println("As 2 condições são verdadeiras"); 
	// }
	///	System.out.println("O numero 1 agora é " + numero1);
	//	System.out.println("O numero 2 agora é " + numero2);

	  SmartTv smartTV = new SmartTv();
	  Scanner scanner = new Scanner(System.in);
	 System.out.println("O que quer fazer?");
	  int opcoes = scanner.nextInt();
	  if (opcoes == 1) {
		  System.out.println("Volume antigo: " + volume);
		  System.out.println("Novo volume: "+ smartTV.aumentarvolume(volume));
	  } 
	  
	 
	  
	}
	
	public static int adicao (int numeroteste2) {
		
		numeroteste2 ++;
		return numeroteste2;
	
	}
	
	public static String verificacaonumeroteste(int numeroteste, int numeroteste2) {
		numeroteste2 = adicao(numeroteste2);
		return (numeroteste == numeroteste2) ? "são iguais" : "são diferentes";
	}
	
	
	
}
