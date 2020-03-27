package ejercicios;
import javax.swing.*;
public class CondicionalesII {

	public static void main(String[] args) {
		String figura= JOptionPane.showInputDialog("Elige una opción: \n1: Cuadrado \n2:Rectángulo \n3:Triángulo \n4:Círculo");
		int figuraElegida= Integer.parseInt(figura);
			switch (figuraElegida)
			{
				case 1:
				{
					String lado= JOptionPane.showInputDialog("Ingrese en cm la medida de un lado del cuadrado:");
					double ladoUsuario= Double.parseDouble(lado);
					double resultado= Math.pow(ladoUsuario, 2);
					System.out.println("El area del cuadrado es: "+ resultado);
					break;
				}
				
				case 2:
				{
					String base= JOptionPane.showInputDialog("Ingrese en cm la base del rectángulo:");
					String altura= JOptionPane.showInputDialog("Ingrese en cm la altura del rectángulo:");
					double baseUsuario= Double.parseDouble(base);
					double alturaUsuario= Double.parseDouble(altura);
					double resultado= baseUsuario*alturaUsuario;
					System.out.println("El area del rectángulo es: "+ resultado);
					break;
				}
				
				case 3:
				{
					String base= JOptionPane.showInputDialog("Ingrese en cm la base del triángulo:");
					String altura= JOptionPane.showInputDialog("Ingrese en cm la altura del triángulo:");
					double baseUsuario= Double.parseDouble(base);
					double alturaUsuario= Double.parseDouble(altura);
					double resultado= (baseUsuario*alturaUsuario)/2;
					System.out.println("El area del triángulo es: "+ resultado);
					break;
				}
				
				case 4:
				{
					String radio= JOptionPane.showInputDialog("Ingrese el radio del círculo");
					double radioUsuario= Double.parseDouble(radio);
					double resultado= Math.pow(radioUsuario,2)*3.14;
					System.out.println("El área del círculo es: " + resultado);
					break;
				}
			}
	

	}

}
