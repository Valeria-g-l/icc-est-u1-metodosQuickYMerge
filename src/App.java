import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arregloOriginal = {5, 10, 20, 2, 40, 33, 7, 22, 4, 39, 1};
        Scanner entrada = new Scanner(System.in);
        View vista = new View();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        System.out.println("***** ORDEN ORIGINAL ******");
        vista.imprimirArreglo(arregloOriginal);

        System.out.println("\nSeleccione algoritmo:");
        System.out.println("[1]. MergeSort");
        System.out.println("[2]. QuickSort");
        int opcion = entrada.nextInt();

        System.out.println("¿Desea ver los pasos intermedios? (true/false):");
        boolean mostrarPasos = entrada.nextBoolean();

        int[] copia = arregloOriginal.clone();

        switch (opcion) {
            case 1:
                System.out.println("\n**** MERGE SORT ****");
                merge.ordenar(copia, mostrarPasos);
                System.out.println("Resultado final:");
                vista.imprimirArreglo(copia);
                break;
            case 2:
                System.out.println("\n**** QUICK SORT ****");
                quick.ordenar(copia, mostrarPasos);
                System.out.println("Resultado final:");
                vista.imprimirArreglo(copia);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
