import java.util.Scanner;

public class RecetasCocina {
    static void main() {
        var consola = new Scanner(System.in) ;

        System.out.println("*** Recetas de Cocina ***");
        //nombre de la receta
        System.out.printf("Ingresa el nombre: ");
        var nombreReceta = consola.nextLine();

        //Nombre de los ingredientes
        System.out.println("Ingresa los ingredientes: ");
        var nombreIngredientes = consola.nextLine();

        //Tiempo de preparacion en (min)
        System.out.printf("Ingresa el tiempo de preparacion: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        //Dificultad
        System.out.printf("Ingresa la dificultad: \n");
        var dificultaPreparacion = consola.nextLine();

        //Impresion de resultado
        System.out.printf("--- Receta de Cocina ---\n");
        System.out.println("\t Nombre receta = " + nombreReceta);
        System.out.println("\t Nombre ingredientes = " + nombreIngredientes);
        System.out.println("\t Tiempo de preparacion = " + tiempoPreparacion +"min");
        System.out.println("\t Dificulta de preparacion = " + dificultaPreparacion);

    }
}
