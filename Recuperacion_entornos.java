package recuperacion_entornos;

import java.util.Scanner;

public class Recuperacion_entornos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner (System.in);
		String[] nombre; // el vector de nombres
		double [][] nota; // la matriz de notas
		
		int nalum; // el número de alumnos que hay en la clase	
		// variable de trabajo para el cálculo de las medias
		double sumanotas=0; 
		double media;
		
		// PREGUNTAMOS EL nº DE ALUMNOS QUE HAY EN LA CLASE
		
		System.out.println("Introduzca el nº de alumnos que hay en esta clase: ");
		nalum=lector.nextInt();
		lector.nextLine();
		
		// Inicializamos los vectores de datos
		
		nombre= new String[nalum];
		nota=new double[nalum][3];
		
		// AHORA EMPEZAMOS A PEDIR ALUMNOS (nombres y notas)
		
		for (int i=0 ; i<nalum;i++)
		{
			// el nombre
			System.out.println("Introduzca el nombre del alumno nº "+(i+1));
			nombre[i]=lector.next();
			
			// las notas
			for (int j=0;j<3;j++)
			{
				System.out.println("Introduzca la nota del alumno "+nombre[i]+" ");
				nota[i][j]=lector.nextDouble();
			}
		}
		// ahora listamos los nombres y  sus notas medias
		
				for (int i=0; i<=nalum;i++)
				{
					// calculamos la nota media del alumno "i-esimo"

					

					for (int j=0;j<3;j++)

					{
						sumanotas=sumanotas+nota[i][j];
						// lugar donde te pido que pongas un punto de interrupción condicional en el Ejecicio 2
					}
					
					media=sumanotas/3;
					
					// imprimimos el alumno y su media
					
					System.out.println("El alumno "+nombre[i]+ " tiene una nota media de :"+media);
				}


	}

}
