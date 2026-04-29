public class insertionSort {

    public static void ordenar(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }
}
