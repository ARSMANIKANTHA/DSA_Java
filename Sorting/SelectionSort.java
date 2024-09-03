import java.util.Arrays;
/*
Selection Sort :
1.Select smallest element index in the array
2.Swap that element to the first Index (i.e "i" this value changes for every iteration)
3.Repeat this process for every Item
T.C : O(N^2)
S.C : O(1)
*/
public class SelectionSort {
    public static String selectionSort(int []arr){
        //[4,6,2,5,3,1]
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            int minIndex = i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i]=temp;
            }
            
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        System.out.println(selectionSort(new int []{4,6,-6,2,5,3,1}));
    }
}
