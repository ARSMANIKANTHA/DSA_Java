public class MergeSort{
    //Code to print array
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
    //mergeSort  - dividing array
    public static void mergeSort(int array[],int left,int right){
        if(right>left){
            int middle = (right+left)/2;
            mergeSort(array, left, middle);
            mergeSort(array,middle+1,right);
            merge(array,left,middle,right);
        }
    }
    public static void merge(int []array,int left,int middle,int right){
        int [] leftArray = new int[middle-left+2];
        int [] rightArray = new int[right-middle+1];

        for(int i=0;i<=middle-left;i++){
            leftArray[i]=array[left+i];
        }
        for(int i=0;i<right-middle;i++){
            rightArray[i]=array[middle+1+i];
        }

        leftArray[middle-left+1]= Integer.MAX_VALUE;
        rightArray[right-middle]= Integer.MAX_VALUE;

        int leftIndex = 0,rightIndex = 0;
        for(int k=left;k<=right;k++){
            
            if(leftArray[leftIndex]<rightArray[rightIndex]){
                array[k]=leftArray[leftIndex];
                leftIndex++;
            }else{
                array[k]=rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    
    public static void main(String[] args) {
        int arr[] =  {5,3,2,5,68,36,35,3,2};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}