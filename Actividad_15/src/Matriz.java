

import java.util.Scanner;

public class Matriz {

	private static Scanner teclado;

	public static void main(String[] args) {
		
	 
		        final int FILAS = 2, COLUMNAS = 2;
		        teclado = new Scanner(System.in);
		        int i, j;
		        int[][] A = new int[FILAS][COLUMNAS];
		        System.out.println("Lectura de elementos de la matriz: ");
		        for (i = 0; i < FILAS; i++) {
		            for (j = 0; j < COLUMNAS; j++) {
		                System.out.print("A[" + i + "][" + j + "]= ");
		                A[i][j] = teclado.nextInt();
		            }
		        }
		        
		        System.out.println("valores introducidos:");
		        for (i = 0; i < A.length; i++) { 
		            for (j = 0; j < A[i].length; j++) {
		                System.out.print(A[i][j] + " ");       
		            }
		          System.out.println();
		        /*
		         * MODIFICACIÓN
		         */
		          System.out.println("Prueba de modificación");
		        }

			}

	}


