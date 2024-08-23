
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {-1, 6, 9, 8, 12};
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i=1;i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int small = smallest(array);
        
        for(int i=0;i<array.length;i++){
            if(array[i] == small){
                return i;
            }
        }
        return -1;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
        int smallest = table[startIndex];
        int index =startIndex;
        for(int i=startIndex; i < table.length; i++){
            if(table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
       int temp = array[index1];
       array[index1] = array[index2];
       array[index2] = temp;
    }   
    public static void sort(int[] array) {
       for(int i=0; i<array.length; i++){
           int index = indexOfSmallestFrom(array,i);
           swap(array, index, i);
           for(int num : array){
               System.out.print(num+",");
               
           }
           System.out.println("");
       }
        
    }
    

}
