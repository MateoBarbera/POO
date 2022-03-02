package threads;

public class MatrizMultiplicacion extends Thread  {

	  int row=0,k,j;
	  int suma=0;

	 int matriz[][];
	 int multiplicacion[][];

	 MatrizMultiplicacion(int row,int matriz[][],int multiplicacion[][]){

	  this.row = row;

	  this.matriz = matriz;

	  this.multiplicacion = multiplicacion;

	 } 

	 public void run(){  

	  for (j = 0; j < matriz[row].length; j++){

	           for (k = 0; k < matriz.length; k++){

	        	   suma = suma + matriz[row][k]*matriz[k][j];

	           }
	           
	           System.out.println(suma);
	           try {
					sleep((int)(Math.random() * 1000));
				} catch (InterruptedException e) 
				{
					
				}

	           multiplicacion[row][j] = suma;

	           suma = 0;

	        }

	 } 

	}

