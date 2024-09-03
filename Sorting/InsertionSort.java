import java.util.Arrays;
/*
Insertion sort :
Assumption : Divide entire array into two parts => sorted array | unsorted array
Intially Sorted array is empty...and unsorted array consists of all elements
Working : 
start from the first index till last index 
select an element from unsorted array and put that element in the correct position in the sorted array
 */
public class InsertionSort {
    public static String insertionSort(int arr[]){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int tempIndex = i;
            for(int j=i-1;j>=0;j--){
                if(arr[tempIndex]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[tempIndex];
                    arr[tempIndex]=temp;
                    --tempIndex;
                }
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        System.out.println(insertionSort(new int[]{-1,6,-4,83,0,78,3,77,47,78,24,55,7}));
    }
}
