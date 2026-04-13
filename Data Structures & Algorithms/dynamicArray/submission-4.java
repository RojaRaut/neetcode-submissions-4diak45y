class DynamicArray {
int capacity;
int arr[];
int length;
    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;length = 0;
    }

    public int get(int i) {
      //  if(i <0 || i>=capacity) return -1;
        /*for(int count=0; count<arr.length; count++){
            if(count == i) {
                return arr[i];
            }
        }*/
        return arr[i];
    }

    public void set(int i, int n) {
        /* if(i <0 || i>=capacity) return;
       // if (length == 0 && i == 0) {arr[i] = n; length++; return;}
        if(length == capacity || i == 0) {arr[i] = n; return;}
        if(length > 0 && length < capacity) {
        int len = capacity;
        int itr = len-i; int j=1;
        while(itr>0){
            arr[len] = arr[len-j];
            j--;
            itr--;
        }
        arr[i] = n;
        length++;
        }
       // else {return;}*/
        arr[i] = n;
    }

    public void pushback(int n) {
       // if(length == 0) {arr[length] = n; length++; return;}
        if(length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        //System.out.println(arr);
        int res = arr[length-1];
        length--;
        return res;
    }

    private void resize() {
        capacity = 2*capacity;
        int[] newarr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
