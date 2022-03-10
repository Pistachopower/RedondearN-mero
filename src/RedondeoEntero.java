import java.util.Scanner;

public class RedondeoEntero {

	public static void main(String[] args) {
		/**
		 * Realizar un programa que pida como entrada un número decimal y
		 *  lo muestre redondeado al entero más proximo. 
		 */
		
		double var;
		
		System.out.println("Digite el número: ");
		Scanner sc= new Scanner(System.in);
		
		//aqui inicializas la variable var
		var= sc.nextDouble();
		
		
		/*
		 * La operacion va de izquierda a derecha. 
		 */
		int var2= (int) Math.round(var);
		/*
		 * La línea 23 lo que hace es que (var) recoje el resultado, lo convierte
		 * en entero con el (int) y luego con la clase Math, round hace la función 
		 * de que se ese numero se anexe el numero mas proximo. 
		 */
				
		System.out.println("El entero próximo es: " + var2);
		
		/*
		 * Este sería otra solucion 
		 * System.out.println("El entero próximo es: " + Math.round(var));
		 */
		
	}

}
