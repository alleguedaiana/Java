package ejercicios;
import javax.swing.*;
public class ArraysII {

	public static void main(String[] args) {
		
		String [] paises=new String[8];
			for(int i=0; i<paises.length; i++)
			{
				paises[i]=JOptionPane.showInputDialog("Ingrese un país");
			}
			for(String elemento: paises)
			{
				System.out.println(elemento);
			}
			

	}

}
