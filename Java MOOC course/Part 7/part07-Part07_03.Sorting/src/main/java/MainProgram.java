import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
    }
    
    public static int smallest(int[] array){
        if(array.length == 0){
            return 0;
        }
        
        int smallest =array[0];
        for(int small : array){
            if(small < smallest){
                smallest = small;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        if(array.length == 0){
            return 0;
        }
        
        int smallest = array[0];
        int index = 0;
        int smallestIndex=0;
        
        for (int small : array){
            if(small < smallest){
                smallest =small;
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int index = 0;
        
        for(int i =startIndex;i<table.length;i++ ){
            if(table[i]<= small){
                small = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        
        for(int i=0;i<array.length;i++){
            swap(array,i , indexOfSmallestFrom(array, i));

            System.out.println( Arrays.toString(array));
        }
    }
    
    
}
