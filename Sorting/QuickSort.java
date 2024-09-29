public class QuickSort {
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<high && arr[i]<=pivot){
                i++;
            }
            while(i>low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    
    public void quickSort(int arr[],int low,int high){
        if(low<high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,35,6,-1,3,5,5};
        QuickSort obj = new QuickSort();
        obj.quickSort(arr,0,arr.length-1);
        obj.printArray(arr);
    }
}
