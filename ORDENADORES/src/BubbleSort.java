public class BubbleSort {

    public static int bubbleSort (long[] array) {
        int n = array.length;
        int op = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                op++;
                if (array[j] > array[j+1]) {
                    long temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    op += 3;
                }
            }
        }
        System.out.println("Array ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.printf("Qtd de operacoes: %d\n", op);
        return op;
    }
    public static void main(String[] args) throws Exception {
        
        long array1[] = {2836, 9787, 658, 26532};
        long array2[] = {68653, 265808, 567657, 4737673, 9069327, 80, 932858};
        long array3[] = {66532676, 693268657665l, 279866, 583653268, 2653};
        long array4[] = {2836, 9787, 658, 26532, 68653, 265808, 567657, 4737673, 9069327, 80, 932858, 66532676, 693268657665L, 279866, 583653268, 2653};

        System.out.printf("array1:\n");
        bubbleSort(array1);
        System.out.printf("\n"); 
        System.out.printf("array2:\n");
        bubbleSort(array2);
        System.out.printf("\n");
        System.out.printf("array3:\n");
        bubbleSort(array3);
        System.out.printf("\n");
        System.out.printf("array4:\n");
        bubbleSort(array4);
    }

}
    

