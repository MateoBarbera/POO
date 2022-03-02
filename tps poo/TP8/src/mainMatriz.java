package threads;

import java.util.Random;

public class mainMatriz {

	public static void main(String[] args) throws InterruptedException  {
		
		 int filas=0,columnas=0,i=0,j=0;

		Random numeroRandom = new Random();
		int [][] primerMatriz = new int [5][5];
		for (int i1 = 0; i1 < primerMatriz.length; i1++ ) {
			for (int j1 = 0; j1< primerMatriz.length; j1++) {
					primerMatriz[i1][j1] = numeroRandom.nextInt(100);
			}
		} 
		
		filas = 5;
		columnas = 5; 
		System.out.println("\nMatriz Original\n");

	    for (i = 0; i < filas; i++){

	      for (j = 0; j < columnas; j++)

	         System.out.print(primerMatriz[i][j]+"\t");

	     System.out.println();

	   }


	     int MatrizMultiplicacion[][] = new int[filas][columnas];

	     MatrizMultiplicacion MatriZConThread[] = new MatrizMultiplicacion[filas];

	     for(int l=0;l<MatriZConThread.length;l++){

	    	 MatriZConThread[l] = new MatrizMultiplicacion(l,primerMatriz,MatrizMultiplicacion);

	    	 MatriZConThread[l].start();

	     }
	     while(Thread.activeCount() > 1);

	     System.out.println("\nMultiplicacion de la matriz:\n");

	     for (i = 0; i < filas; i++){

	        for (j = 0; j < columnas; j++)
	        	System.out.print(MatrizMultiplicacion[i][j]+"\t");
	        	System.out.print("\n");

	     }

	   }

	

}


