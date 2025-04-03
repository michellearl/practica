package practica1;
import java.util.Scanner;


/**
 * Clase notas es la clase principal que gestiona las notas introducidas por el usuario
 * Con estas notas calcula una nota final, sacando la media y determinando si el alumno aprueba o suspende
 * Esta clase tiene diferentes metodos que se encargan de: ingresar las notas,comprobar si las notas introducidas son validas, calcular la nota y mostar el resultado final
 */
public class notas {
	//declaramos la variables que nos hacen falta
	double notaUnidad1, notaUnidad2, notaUnidad3;
	double acumuladoUnidad1, acumuladoUnidad2, acumuladoUnidad3, notaFinal;
	//utilizames scanner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	
	/**
	 * Primer metodo para pedir al usuario que introduzca las notas del alumno y guardamos esos datos en las variables notaUnidad1, notaUnidad2 y notaUnidad3
	 */
    public void ingresarNotas() {
        System.out.println("Ingrese las notas del estudiante:");

        System.out.print("Ingrese nota de la unidad 1: ");
        notaUnidad1 = entrada.nextDouble();

        System.out.print("Ingrese nota de la unidad 2: ");
        notaUnidad2 = entrada.nextDouble();
        
        System.out.print("Ingrese nota de la unidad 3: ");
        notaUnidad3 = entrada.nextDouble();    
    }
	
	/**
	 * Este segundo metodo es para comprobar que las notas no son superiores a 10
	 */
    public void comprobarNotas() {
        comprobarNota("Unidad 1", notaUnidad1);
        comprobarNota("Unidad 2", notaUnidad2);
        comprobarNota("Unidad 3", notaUnidad3);
    }

    /**
     * Método auxiliar para comprobar la validez de una nota.
     * @param unidad El nombre de la unidad (por ejemplo, "Unidad 1").
     * @param nota La nota a comprobar.
     */
    private void comprobarNota(String unidad, double nota) {
        if (nota > 10) {
            System.out.println("La " + unidad + " tiene una nota incorrecta.");
        } else {
            System.out.println("La " + unidad + " tiene una nota correcta.");
        }
    }
    
	
	/**
	 * Este tercer metodo calcula las notas acumuladas de las tres unidades formativas
	 * y calcula la nota final (notaFinal) basada en los siguientes porcentajes:
	 * 35% para notaUnidad1 y notaUnidad2, y 30% para notaUnidad3.
	 */
	public void calcularNotas() {
		acumuladoUnidad1= notaUnidad1*0.35;
		acumuladoUnidad2 = notaUnidad2 * 0.35;
		acumuladoUnidad3 = notaUnidad3 * 0.30;
		
		notaFinal = acumuladoUnidad1 + acumuladoUnidad2+ acumuladoUnidad3;
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	
	
	/**
	 * Con el cuarto metodo mostramos las notas ingresadas por el usuario, las notas acumuladas y la nota final calculada.
	 */
    public void mostrarResultados() {
        System.out.println("Notas ingresadas:");
        System.out.println("Nota unidad 1 = " + notaUnidad1);
        System.out.println("Nota unidad 2 = " + notaUnidad2);
        System.out.println("Nota unidad 3 = " + notaUnidad3);
        
        System.out.println("Notas acumuladas:");
        System.out.println("Acumulado unidad 1 = " + acumuladoUnidad1);
        System.out.println("Acumulado unidad 2 = " + acumuladoUnidad2);
        System.out.println("Acumulado unidad 3 = " + acumuladoUnidad3);
        
        System.out.println("Nota final = " + notaFinal);
    }

	/**
	 * Con el quinto metodo se determina si el estudiante ha aprobado o suspendido segun la nota final.
	 * Si la nota es menor que 5, el estudiante suspende. Si es mayor o igual a 5, estara aprobado.
	 */
    public void verificarAprobado() {
        if (notaFinal < 5 && notaFinal >= 0) {
            System.out.println("El estudiante ha suspendido.");
        } else if (notaFinal >= 5 && notaFinal <= 10) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("Error en las notas.");
        }
    }
		
	/**
	 * Este ultimo es el metodo principal que ejecuta el flujo del programa.
	 * Llama a los metodos para ingresar notas, comprobarlas, calcular la nota final, mostrar los resultados y evaluar si el alumno aprueba o suspende.
	 */
    public static void main(String[] args) {
        // Creamos una instancia de la clase Notas
        notas calculadoraNotas = new notas();
        
        // Llamamos a los métodos
        calculadoraNotas.ingresarNotas();
        calculadoraNotas.comprobarNotas();
        calculadoraNotas.calcularNotas();
        calculadoraNotas.mostrarResultados();
        calculadoraNotas.verificarAprobado();
    }

}