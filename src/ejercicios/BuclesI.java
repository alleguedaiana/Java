package ejercicios;

import javax.swing.JOptionPane;

public class BuclesI {

	public static void main(String[] args) {
		String contrase�a="1234";
		String psw="";
		
			while(contrase�a.equals(psw)==false)
			{
				psw= JOptionPane.showInputDialog("Ingrese su contrase�a");
				
				if(contrase�a.equals(psw)==false)
				{
					psw=JOptionPane.showInputDialog("Contrase�a incorrecta. Ingrese nuevamente");
				}
			}
			
			System.out.println("Contrase�a correcta");

	}

}
