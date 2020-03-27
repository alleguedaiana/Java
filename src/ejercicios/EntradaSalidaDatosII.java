package ejercicios;
import javax.swing.*;
public class EntradaSalidaDatosII {

	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		int edadUsuario=Integer.parseInt(edad);
		
		
		System.out.println("Su nombre es " + nombre + " y se edad "+ edadUsuario);

	}

}
