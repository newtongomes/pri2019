package br.estacio.pri.exemplos;

import java.util.Scanner;

public class ExemploSoma
{
	public static void main(String[]args)
	{
		//declara��o das vari�veis
		int numero1, numero2, soma;

		//declara��o do objeto Scanner
		Scanner sc = new Scanner(System.in);

		//recebe pelo teclado dois n�meros inteiros
		System.out.print("Entre com o primeiro n�mero inteiro: ");
		numero1 = sc.nextInt();
		System.out.print("Entre com o segundo n�mero inteiro: ");
		numero2 = sc.nextInt();

		soma = numero1 + numero2;
		System.out.printf("A soma de %d e %d resulta em %d\n",numero1, numero2, soma);
	}
}