public class SelectionSort {

    public static void selectionSort (long[] array) {
        int op = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                op++;
                if (array[j] < array[minIndex]) {
                  minIndex = j;
                }
            }
        long temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
        op += 3;
        }
        for (int i = 0; i < n; i++) {
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
        selectionSort(array1);
        System.out.printf("\n"); 
        System.out.printf("array2:\n");
        selectionSort(array2);
        System.out.printf("\n");
        System.out.printf("array3:\n");
        selectionSort(array3);
        System.out.printf("\n");
        System.out.printf("array4:\n");
        selectionSort(array4);
    }
}
