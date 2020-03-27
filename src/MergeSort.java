public class MergeSort {
    
      private int i;
    public void sort(int arr[], int left, int right) {
        if(left < right){
            //ENCONTRAMOS EL PUNTO MEDIO DEL VECTOR.
            int middle = (left + right) / 2;
            
            //DIVIDE LA PRIMERA Y SEGUNDA MITAD.
            sort(arr, left, middle);
            sort(arr, middle+1, right);
            
            //UNE LAS MITADES.
            merge(arr, left, middle, right);
        }
    }
    public void merge(int arr[], int left, int middle, int right) {
        //ENCUENTRA EL TAMANO DE LOS SUB-VECTORES PARA UNIRLOS.
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        //VECTORES TEMPORALES
        int leftArray[] = new int [n1];
        int rightArray[] = new int [n2];
        
        //COPIA LOS DATOS A LOS ARRAYS TEMPORALES.
        for (int i=0; i < n1; i++) {
            leftArray[i] = arr[left+i];
        }
        for (int j=0; i < n2; j++) {
            rightArray[j] = arr[middle + j + 1];
        }
        
        //INDICE INICIAL DEL PRIMER Y SEGUNDO SUB-VECTOR
        int i = 0, j = 0;
        
        //INDICE INICIAL DEL SUB VECTOR ARR[]
        int k = left;
        
        //Ordenamiento
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
                
            }
            k++;
            
            }//FIN DEL WHILE
        
        //COPIAR LOS ELEMENTOS RESTANTES DEL LEFTARRAY[]
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        //COPIAR LOS ELEMENTOS RESTANTES DEL RIGHTARRAY[]
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        }
        {
    }
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Mergesort mergeSort = new MergeSort();
        int arr [] = {5,26,12,6,1,4,7};
        int n = arr.length;
        
        
    System.out.println();
    
    System.out.println("ARRAY ORDENADO: ");
    mergeSort.sort(arr,0,n-1);
    }
}
