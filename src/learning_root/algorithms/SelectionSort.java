package learning_root.algorithms;

public class SelectionSort{

    public static void swapElements(int[] array, int i, int j){
        //save first element value in temp var
        int temp = array[i];
        //set the first element to be the lowest in
        array[i] = array[j];
        array[j] = temp;

    }

    public static int indexLowest(int[] array, int start){
        int lowIndex = start;
        for (int i = start; i < array.length; i++){
            if (array[i]<array[lowIndex]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }


    public static void selectionSort(int[] array){
        for (int i =0 ; i < array.length; i ++){
            int j = indexLowest(array, i);
            swapElements(array, i , j);

        }
    }
}
