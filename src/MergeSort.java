public class MergeSort {
    private View vista = new View();

    public void ordenar(int[] arreglo, boolean mostrarPasos) {
        mergeSort(arreglo, 0, arreglo.length - 1, mostrarPasos);
    }

    private void mergeSort(int[] arreglo, int izquierda, int derecha, boolean mostrarPasos) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            mergeSort(arreglo, izquierda, medio, mostrarPasos);
            mergeSort(arreglo, medio + 1, derecha, mostrarPasos);
            combinar(arreglo, izquierda, medio, derecha);
            if (mostrarPasos) {
                System.out.print("Paso: ");
                vista.imprimirArreglo(arreglo);
            }
        }
    }

    private void combinar(int[] arreglo, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] izquierdaArr = new int[n1];
        int[] derechaArr = new int[n2];

        for (int i = 0; i < n1; i++) izquierdaArr[i] = arreglo[izquierda + i];
        for (int j = 0; j < n2; j++) derechaArr[j] = arreglo[medio + 1 + j];

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            arreglo[k++] = (izquierdaArr[i] <= derechaArr[j]) ? izquierdaArr[i++] : derechaArr[j++];
        }
        while (i < n1) arreglo[k++] = izquierdaArr[i++];
        while (j < n2) arreglo[k++] = derechaArr[j++];
    }
}
