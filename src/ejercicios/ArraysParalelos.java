package ejercicios;

import javax.swing.JOptionPane;

public class ArraysParalelos {

	public static void main(String[] args) {
		int sizeAgenda = 2;
		
		String[] nombre = new String[sizeAgenda];
		String[] domicilio = new String[sizeAgenda];
		String[] telefono = new String[sizeAgenda];
		
		for (int i=0; i<sizeAgenda;i++)
		{
			nombre[i]=JOptionPane.showInputDialog("Ingrese su nombre");
			domicilio[i]=JOptionPane.showInputDialog("Ingrese su domicilio");
			telefono[i]=JOptionPane.showInputDialog("Ingrese su telefono");
		}
		
		for (int i=0; i<sizeAgenda;i++)
		{
			System.out.println(nombre[i]+ "\n" + domicilio[i] + "\n" + telefono[i]);
		}
	}

}
