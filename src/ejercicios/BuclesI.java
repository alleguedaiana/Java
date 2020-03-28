package ejercicios;

import javax.swing.JOptionPane;

public class BuclesI {

	public static void main(String[] args) {
		String contraseña="1234";
		String psw="";
		
			while(contraseña.equals(psw)==false)
			{
				psw= JOptionPane.showInputDialog("Ingrese su contraseña");
				
				if(contraseña.equals(psw)==false)
				{
					psw=JOptionPane.showInputDialog("Contraseña incorrecta. Ingrese nuevamente");
				}
			}
			
			System.out.println("Contraseña correcta");

	}

}
