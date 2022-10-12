package learning_root;

import learning_root.algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {

        SelectionSort sort_these = new SelectionSort();



    }

    public void nConstraintTest(int num_runs){
        int i = 1;
        while(i < num_runs -1){
            fillArray(num_runs, i);
            i++;
        }

    }

    public  void fillArray(int array_size){

        //Array initialization. Constant time.
        int[] array = new int[array_size];
        long begin_time, end_time, run_time ;
        begin_time = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++){
            //assign random number between one and ten to each position of the array.
            array[i] = (int)(Math.random() * array_size) + 1;
            System.out.println(array[i]);
        }
        end_time = System.currentTimeMillis();
        run_time = end_time - begin_time;


        int size = array.length ;


        System.out.println("Size of array: " + size + ". Time to complete algorithm: " + run_time + " in " +
                "milliseconds");

    }
    public  void fillArray(int array_size, int multiplier){

        //Array initialization. Constant time.
        int[] array = new int[array_size * multiplier];
        long begin_time, end_time, run_time ;
        begin_time = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++){
            //assign random number between one and ten to each position of the array.
            array[i] = (int)(Math.random() * (array_size * multiplier) ) + 1;
            System.out.println(array[i]);
        }
        end_time = System.currentTimeMillis();
        run_time = end_time - begin_time;


        int size = array.length ;


        System.out.println("Size of array: " + size + ". Time to complete algorithm: " + run_time + " in " +
                "milliseconds");

    }



}