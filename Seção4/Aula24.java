package Seção4;

import java.util.Locale; // a importacao do locale

public class Aula24 {
	public static  void main (String []args) {
		Locale.setDefault(Locale.US); // a chamada do Locale 
		int Y = 32;
		double x = 32.323213;
		System.out.println("Bem vindo a meus programas :x");
		System.out.println("Sem quebra de linha do print");
		System.out.println(Y+" Chamando Variavel ");
		System.out.printf("Com formatacao %.2f%n",x);
		System.out.println("Juntando Variaveis "+x+" Metros");
		System.out.printf("Resultado com printF com formatacao = %.2f metros%n",x);
		
		
	}

}
