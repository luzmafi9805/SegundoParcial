public class MinHeap {
    
      DynArray Dyn;
    

    private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MinHeap(DynArray Dyn){
        this.Dyn=Dyn;
    }
 
    public  MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    public boolean isEmpty(){
         return Dyn.isEmpty();
     }
 
    private int parent(int pos)
    {
        return pos / 2;
    }
 
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
   /* private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        { 
            return true;
        }
        return false;
    }*/
 
    private void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
 
   
 
    private void Drown(int indice) {
        int padre = indice;
        int hijoIzq = 2 * indice;
        int hijoDer = 2 * indice+1;
        if (hijoIzq < Dyn.size && Dyn.data[padre] > Dyn.data[hijoIzq]) {
            padre = hijoIzq;
        }
        if (hijoDer < Dyn.size && Dyn.data[padre] > Dyn.data[hijoDer]) {
            padre = hijoDer;
        }
        if (padre != indice) {
            swap(Dyn.data,indice, padre);
            Drown(padre);
        }
        }
        
        
    public void insert (int element)
    {
        Dyn.add(element);
        flotar(Dyn.size - 1);
        
      /*  Heap[++size] = element;
        int current = size;
 
        while (Heap[current] < Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }*/	
    }
 
   public void print()
    {
        System.out.println("Min Valor es:"+Dyn.data[0]);
        for (int i = 0; i <= Dyn.size / 2; i++ )
        {
            System.out.print(" PARENT : " + Dyn.data[i] + " LEFT CHILD : " + Dyn.data[2*i] 
                + " RIGHT CHILD :" + Dyn.data[2 * i  + 1]);
            System.out.println();
            
        } 
    }
 
  
 
    public int remove()
    {
        int retval = Dyn.data[0];
        int x = Dyn.size -1;
        if(Dyn.size != 0){
           this.Dyn.data[0] = this.Dyn.data[x]; 
           Dyn.size--;
           this.Dyn.data[Dyn.size] = 0;
            this.Drown(0);
        }
       
        
       
        return retval;
    }
    
     private void flotar(int index){
        int padre = parent(index);
        int Lugar = index;
        while (Lugar > 0 && Dyn.data[padre] > Dyn.data[Lugar]) {
            swap(Dyn.data,Lugar,padre);
            Lugar = padre;
            padre = padre/2;
        }
        
        
}
     
     
}
