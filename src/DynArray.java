public class DynArray {
    
    
    public int [] data;
    public int size;
    public int [] d2;
    public int size2;
    
    DynArray(){
        this.data=new int[15];
        size=0;
        this.d2 = new int[15];
        size2 = 0;
    }
    
    public void grow (int x){
        int[] temp= new int [data.length*2];
        for( int i=0;i<data.length; i++){
            temp[i]= data[i];
        }
        
        data=temp;
        data[size++]=x;
    }
    
    public  void add(int element){
        if (size<data.length){
            data[size++]=element;
        }else{
            grow(element);
        }
        
    }
    
     public  void addHeap(int element){
        if (size2<d2.length){
            d2[size2++]=element;
        }else{
            growHeap(element);
        }
    }
     
      public void growHeap (int x){
        int[] temp= new int [d2.length*2];
        for( int i=0;i<d2.length; i++){
            temp[i]= d2[i];
        }
        
        d2=temp;
        d2[size2++]=x;
    }
      public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
      
      public void Reducir(int size){
        if(size != d2.length){
            int temp[] = new int[size];
            for (int i = 0; i < temp.length ; i++) {
                temp[i] = d2[i];
            }
           d2 = temp;
        }
    }
}
