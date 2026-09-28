class DynamicArray {

    int[] arr;
    int capacity;
    int tail;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        tail = -1;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(tail+1 >= capacity){
            resize();
        }

        arr[++tail] = n;
    }

    public int popback() {
        int n = arr[tail];
        arr[tail] = 0;
        tail--;
        return n;
    }

    private void resize() {
        int[] temp = new int[capacity * 2];
        for(int i=0; i<capacity; i++){
            temp[i] = arr[i];
        }
        capacity*=2;
        arr = temp;
    }

    public int getSize() {
        return tail + 1;
    }

    public int getCapacity() {
        return capacity;
    }
}
