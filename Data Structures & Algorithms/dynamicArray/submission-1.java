class DynamicArray {
    int capacity;
    int[] arr = new int[0];
    public DynamicArray(int capacity) {
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = n;
        arr = arr2;
        
        if (arr.length > capacity) {
            resize();
        }
    }

    public int popback() {
        int temp = arr[arr.length - 1];
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
        return temp;
    }

    private void resize() {
        capacity *= 2;
    }

    public int getSize() {
        return arr.length;
    }

    public int getCapacity() {
        return capacity;
    }
}
