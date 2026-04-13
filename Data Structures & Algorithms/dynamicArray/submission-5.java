class DynamicArray {

    int capacity;
    int arr[];
    int length;
    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;length = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        int res = arr[length - 1];
        length--;
        return res;
    }

    private void resize() {
        capacity = 2 * capacity;
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
