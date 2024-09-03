import java.util.Arrays;
/*
Bubble Sort : 
Main Idea : Moving largest element to the end of the array...
1.Compare two adjacent values...
2.If next is smaller than the present element swap...else continue
T.C : O(N^2)
S.C : O(1)
 */
public class BubbleSort{
    public static String bubbleSort(int arr[]){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
    // [1,2,3,4,5]

    public static void main(String [] args){
        int array [] = {3,5,3,6,4};
        System.out.println(bubbleSort(array));
    }
}