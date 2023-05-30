import java.util.Arrays;

public class Metodosdeordenamiento {
    int array[];
    public void CrearArreglo(int tamanio){
        array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }
    public void imprimirArreglo(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void MetodoInsercion(int[] array) {
        int j, pivote;
        for (int i = 1; i < array.length; i++) {
            pivote = (array[i]);
            j = i - 1;
            while (j >= 0 && pivote < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = pivote;
        }
    }

    //metodo de la burbuja
    public void MetodoBurbuja(int[] array){
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length-i); j++) {
                if(array[j-1] > array[j]){
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
    public void clonar(int[] array){
        this.array = array.clone();
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(array);
    }
}
