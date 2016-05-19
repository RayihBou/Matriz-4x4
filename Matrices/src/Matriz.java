public class Matriz {

	public static void main(String[] args) {
		// Declaración de Variables
		String name = "Rayih Munir Bou Orm Abool Hosn";
		byte age = 24;
		String nacionalidad = "Venezolano";
		char genero = 'M';
		String profesion = "Ingeniero en Sistemas";
		String titulo = "Proyecto 1 UNAM - Programando con Java para Aplicaciones Android";
		int fila = 4;
		int columna = 4;
		int m = 2; //Multiplicador
		int k = 1;
		int i;
		int j;
		// Fin Declaración de Variables

		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + age);
		System.out.println("Nacionalidad: " + nacionalidad);
		System.out.println("Genero: " + genero);
		System.out.println("Profesión: " + profesion);
		System.out.println("");
		System.out.println(titulo);
		System.out.println("");
		
		System.out.println("Matriz Propuesta: ");
		int [][] matriz	= new int[fila][columna];
			for (i = 0; i < fila; i++) {
				for (j = 0; j < columna; j++) {
					matriz[i][j] = (k)*m;
					m=m+2;  
				}
        }
		
		for (i = 0; i < fila ; i++) {
			for (j = 0; j < columna ; j++) {
				
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}//main
}// class
