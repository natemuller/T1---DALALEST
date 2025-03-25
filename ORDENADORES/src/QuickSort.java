import java.util.Stack;

public class QuickSort {

    public static void quickSort(long[] array, long maisEsquerda, long maisDireita) {
        if (array == null || array.length == 0) return;
        
        Stack<long[]> pilha = new Stack<>();
        pilha.push(new long[]{maisEsquerda, maisDireita});
        
        while (!pilha.isEmpty()) {
            long[] limites = pilha.pop();
            maisEsquerda = limites[0];
            maisDireita = limites[1];
            int esquerda = (int) maisEsquerda;
            int direita = (int) maisDireita;
            
            if (esquerda < direita) {
                long pivo = array[direita];
                int i = esquerda - 1;
                
                for (int j = esquerda; j < direita; j++) {
                    if (array[j] < pivo) {
                        i++;
                        long temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
                
                long temp = array[i + 1];
                array[i + 1] = array[direita];
                array[direita] = temp;
                int indicePivo = i + 1;
                
                pilha.push(new long[]{maisEsquerda, indicePivo - 1});
                pilha.push(new long[]{indicePivo + 1, maisDireita});
            }
        }
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        long array1[] = {2836, 9787, 658, 26532};
        long array2[] = {68653, 265808, 567657, 4737673, 9069327, 80, 932858};
        long array3[] = {66532676, 693268657665l, 279866, 583653268, 2653};
        long array4[] = {2836, 9787, 658, 26532, 68653, 265808, 567657, 4737673, 9069327, 80, 932858, 66532676, 693268657665L, 279866, 583653268, 2653};

        System.out.printf("array1:\n");
        quickSort(array1, 0, array1.length - 1);
        System.out.printf("\n"); 
        System.out.printf("array2:\n");
        quickSort(array2, 0, array2.length - 1);
        System.out.printf("\n");
        System.out.printf("array3:\n");
        quickSort(array3, 0, array3.length - 1);
        System.out.printf("\n");
        System.out.printf("array4:\n");
        quickSort(array4, 0, array4.length - 1);
    }
}
