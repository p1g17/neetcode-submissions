class DynamicArray {
    
    int capacity;
    ArrayList<Integer> list;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>(capacity);
    }

    public int get(int i) {
        return this.list.get(i);
    }

    public void set(int i, int n) {
        this.list.set(i,n);

    }

    public void pushback(int n) {
        if(this.list.size()==this.capacity)
        {
            this.resize();
        }
        this.list.add(n);
    }

    public int popback() {
        return this.list.removeLast();
    }

    private void resize() {
        this.capacity = capacity*2;
        this.list.ensureCapacity(this.capacity);

    }

    public int getSize() {
        return this.list.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
