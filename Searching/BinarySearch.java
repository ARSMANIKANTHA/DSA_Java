public class BinarySearch {
    // Binarysearch is useful for finding an element in the array when the array is sorted.
    // It will take O(log N) Complexity and O(1) extra space.

    // Iterative Approach
    public static int binarySearch(int arr[],int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key)return mid;
            if(key>arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static int binarySearchR(int arr[],int key,int low,int high){
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key)return mid;
            if(arr[mid]>key){
                return binarySearchR(arr, key, low, mid-1);
            }else{
                return binarySearchR(arr, key, mid+1,high);
            }
        }
        return -1;
    }

    //Recursive Approach

    public static void main(String[] args) {
        int arr[] = new int[]{10,20,22,25,30,45,50,55,59};
                            // 0, 1, 2, 3, 4, 5, 6, 7, 8 
        System.out.println((BinarySearch.binarySearch(arr, 59)));
        System.out.println((BinarySearch.binarySearch(arr, 590)));
        System.out.println((BinarySearch.binarySearchR(arr, 59,0,8)));
        System.out.println((BinarySearch.binarySearchR(arr, 99,0,8)));
    }
}
