package ejercicios;
import javax.swing.*;
public class CondicionalesI {

	public static void main(String[] args) {
		String edad= JOptionPane.showInputDialog("Ingrese su edad");
		int edadUsuario= Integer.parseInt(edad);
	
		if(edadUsuario >= 18)
		{
			System.out.println("Usted es mayor de edad");
		}
		else if (edadUsuario >= 13 && edadUsuario <=17)
		{
			System.out.println("Usted es adolescente");
		}
		else
		{
			System.out.println("Usted es menor");
		}

	}}
