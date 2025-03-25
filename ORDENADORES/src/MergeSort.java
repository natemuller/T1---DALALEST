public class MergeSort {

    public static void mergeSort (long[] array, long maisEsquerda, long maisDireita) {
        if (maisEsquerda < maisDireita) {
            long meio = maisEsquerda + (maisDireita - maisEsquerda) / 2;
    
            mergeSort(array, maisEsquerda, meio);
            mergeSort(array, meio + 1, maisDireita);
    
            long[] temp = new long[(int) (maisDireita - maisEsquerda + 1)];
            long i = maisEsquerda, j = meio + 1, k = 0;
            while (i <= meio && j <= maisDireita) temp[(int) k++] = (array[(int) i] <= array[(int) j]) ? array[(int) i++] : array[(int) j++];
            while (i <= meio) temp[(int) k++] = array[(int) i++];
            while (j <= maisDireita) temp[(int) k++] = array[(int) j++];
            System.arraycopy(temp, 0, array, (int) maisEsquerda, (int) (maisDireita - maisEsquerda + 1));
        }
        
        if (maisEsquerda == 0 && maisDireita == array.length - 1) {
            for (long num : array) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) throws Exception {

        long array1[] = {2836, 9787, 658, 26532};
        long array2[] = {68653, 265808, 567657, 4737673, 9069327, 80, 932858};
        long array3[] = {66532676, 693268657665l, 279866, 583653268, 2653};
        long array4[] = {2836, 9787, 658, 26532, 68653, 265808, 567657, 4737673, 9069327, 80, 932858, 66532676, 693268657665L, 279866, 583653268, 2653};

        System.out.printf("array1:\n");
        mergeSort(array1, 0, array1.length - 1);
        System.out.printf("\n"); 
        System.out.printf("array2:\n");
        mergeSort(array2, 0, array2.length - 1);
        System.out.printf("\n");
        System.out.printf("array3:\n");
        mergeSort(array3,0, array3.length - 1);
        System.out.printf("\n");
        System.out.printf("array4:\n");
        mergeSort(array4, 0, array4.length - 1);
    }
}