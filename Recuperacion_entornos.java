package recuperacion_entornos;

public class Recuperacion_entornos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombre; // el vector de nombres
		double [][] nota; // la matriz de notas
		
		int nalum; // el n�mero de alumnos que hay en la clase	
		// variable de trabajo para el c�lculo de las medias
		double sumanotas=0; 
		double media;
		
		// PREGUNTAMOS EL n� DE ALUMNOS QUE HAY EN LA CLASE
		
		System.out.println("Introduzca el n� de alumnos que hay en esta clase: ");
		nalum=lector.nextInt();
		lector.nextLine();
		
		// Inicializamos los vectores de datos
		
		nombre= new String[nalum];
		nota=new double[nalum][3];
		
		// AHORA EMPEZAMOS A PEDIR ALUMNOS (nombres y notas)
		
		for (int i=0 ; i<nalum;i++)
		{
			// el nombre
			System.out.println("Introduzca el nombre del alumno n� "+i+1);
			nombre[i]=lector.nextLine();
			
			// las notas
			for (int j=0;j<=3;j++);
			{
				System.out.println("Introduzca la nota del alumno "+nombre[i]+" ");
				lector.nextDouble();
			}
		}
		

	}

}
