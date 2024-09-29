class LinearSearch{
    public static void linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element "+key+" found at index :"+i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,6,3,6,8,4,8,3};
        LinearSearch.linearSearch(arr,8);
        LinearSearch.linearSearch(arr,10);
    }
}