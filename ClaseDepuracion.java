package ejercicios;

import java.util.Scanner;

public class ClaseDepuracion 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numeroLeido;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Introduce un número");
			numeroLeido = input.nextInt();
			
			if (esPar(numeroLeido))
			{
				System.out.println("El numero leido es par " + numeroLeido);
			}else
			{
				System.out.println("El numero es impar " + numeroLeido);
			}
				
			System.out.println("El número leido es: " + numeroLeido);
		}
		
		System.out.println("El programa ha terminado");
		
		input.close();
	}
	
	static boolean esPar(int numero)
	{
		System.out.println("Voy a evaluar el número");
		if(numero % 2 == 0)
		{
			return true;
		}
			return false;
	}

}
