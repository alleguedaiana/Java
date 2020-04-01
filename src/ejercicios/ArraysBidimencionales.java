package ejercicios;

public class ArraysBidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]matriz=new int [3][4];
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		matriz[0][3]=4;
		
		matriz[1][0]=5;
		matriz[1][1]=6;
		matriz[1][2]=7;
		matriz[1][3]=8;
		
		matriz[2][0]=9;
		matriz[2][1]=10;
		matriz[2][2]=11;
		matriz[2][3]=12;
		
			for (int i=0; i<3; i++)
			{
				for(int j=0; j<4; j++)
				{
					System.out.println(matriz[i][j]);
				}
			}
		
		
		

	}

}
