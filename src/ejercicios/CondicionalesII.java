package ejercicios;
import javax.swing.*;
public class CondicionalesII {

	public static void main(String[] args) {
		String figura= JOptionPane.showInputDialog("Elige una opci�n: \n1: Cuadrado \n2:Rect�ngulo \n3:Tri�ngulo \n4:C�rculo");
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
					String base= JOptionPane.showInputDialog("Ingrese en cm la base del rect�ngulo:");
					String altura= JOptionPane.showInputDialog("Ingrese en cm la altura del rect�ngulo:");
					double baseUsuario= Double.parseDouble(base);
					double alturaUsuario= Double.parseDouble(altura);
					double resultado= baseUsuario*alturaUsuario;
					System.out.println("El area del rect�ngulo es: "+ resultado);
					break;
				}
				
				case 3:
				{
					String base= JOptionPane.showInputDialog("Ingrese en cm la base del tri�ngulo:");
					String altura= JOptionPane.showInputDialog("Ingrese en cm la altura del tri�ngulo:");
					double baseUsuario= Double.parseDouble(base);
					double alturaUsuario= Double.parseDouble(altura);
					double resultado= (baseUsuario*alturaUsuario)/2;
					System.out.println("El area del tri�ngulo es: "+ resultado);
					break;
				}
				
				case 4:
				{
					String radio= JOptionPane.showInputDialog("Ingrese el radio del c�rculo");
					double radioUsuario= Double.parseDouble(radio);
					double resultado= Math.pow(radioUsuario,2)*3.14;
					System.out.println("El �rea del c�rculo es: " + resultado);
					break;
				}
			}
	

	}

}
