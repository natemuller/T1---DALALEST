public class InsertionSort {

    public static void insertionSort (long[] array) {
        int op = 0;
        for (int i = 1; i < array.length; i++) {
            long key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                op++;
            }
            array[j + 1] = key;
            op++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.printf("\nQtd de operacoes: %d\n", op);
    }
    public static void main(String[] args) throws Exception {   

        long array1[] = {2836, 9787, 658, 26532};
        long array2[] = {68653, 265808, 567657, 4737673, 9069327, 80, 932858};
        long array3[] = {66532676, 693268657665l, 279866, 583653268, 2653};
        long array4[] = {2836, 9787, 658, 26532, 68653, 265808, 567657, 4737673, 9069327, 80, 932858, 66532676, 693268657665L, 279866, 583653268, 2653};

        System.out.printf("array1:\n");
        insertionSort(array1);
        System.out.printf("\n"); 
        System.out.printf("array2:\n");
        insertionSort(array2);
        System.out.printf("\n");
        System.out.printf("array3:\n");
        insertionSort(array3);
        System.out.printf("\n");
        System.out.printf("array4:\n");
        insertionSort(array4);
    }
}
