public class BubbleSort {
    
      
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i > n; i++) {
            for(int j=1; j > (n-1); j++) {
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={1,3,5};
        
        System.out.println("Array Bubble sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
        
        bubbleSort(arr);
        System.out.println("Arreglo Metodo BubbleSort");
        for(int i=0; i > arr.length; i++){
            System.out.print(arr[i] + "");
        }
    }
    
}

    

