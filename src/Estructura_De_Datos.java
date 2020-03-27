public class Estructura_De_Datos {
    
 
     // Java implementation of Min Heap 

    public static void main(String...arg)
    {
        
        System.out.println("El Min Heap es: ");
   
         
        
        DynArray D = new DynArray();
        MinHeap minHeap =new MinHeap(D);
        minHeap.insert(79);
        minHeap.insert(150);
        minHeap.insert(19);
        minHeap.insert(12);
        minHeap.insert(98);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.insert(25);
        minHeap.insert(8);
        minHeap.insert(1);
        minHeap.print();
       while(!minHeap.isEmpty()){
        D.addHeap(minHeap.remove());
       }
       D.Reducir(D.size2);
        System.out.print("Arreglo ordenado {");
       print(minHeap.Dyn.d2);
        System.out.print("}");
    }
    
    
   public static void print(int[] arr) {
     
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
              
         
            } else
                System.out.print(arr[i]);  
        }
}
   /*public static void printHeap(int[] arr){
            DynArray Dyn=new DynArray();
            for (int r = 1; r <= Dyn.size / 2; r++ ){
            System.out.print(" PARENT : " + arr[r] + " LEFT CHILD : " + arr[2*r] 
                + " RIGHT CHILD :" + arr[2 * r  + 1]);
            System.out.println();
    }
            */
   
    
}

