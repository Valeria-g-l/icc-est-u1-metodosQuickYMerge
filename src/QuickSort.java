public class QuickSort {
    private View vista = new View();

    public void ordenar(int[] arreglo, boolean mostrarPasos) {
        quickSort(arreglo, 0, arreglo.length - 1, mostrarPasos);
    }

    private void quickSort(int[] arreglo, int bajo, int alto, boolean mostrarPasos) {
        if (bajo < alto) {
            int indicePivote = particionar(arreglo, bajo, alto);
            if (mostrarPasos) {
                System.out.print("Paso: ");
                vista.imprimirArreglo(arreglo);
            }
            quickSort(arreglo, bajo, indicePivote - 1, mostrarPasos);
            quickSort(arreglo, indicePivote + 1, alto, mostrarPasos);
        }
    }

    private int particionar(int[] arreglo, int bajo, int alto) {
        int pivote = arreglo[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] < pivote) {
                i++;
                int temp = arreglo[i]; arreglo[i] = arreglo[j]; arreglo[j] = temp;
            }
        }
        int temp = arreglo[i + 1]; arreglo[i + 1] = arreglo[alto]; arreglo[alto] = temp;
        return i + 1;
    }
}
