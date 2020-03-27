package ejercicios;
import java.util.*;

public class EntradaSalidaDatos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		int edad= entrada.nextInt();
		
		System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
		
		entrada.close();
	}

}
