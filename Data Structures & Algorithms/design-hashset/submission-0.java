class MyHashSet {
    ArrayList<Integer> arr = null;

    public MyHashSet() {
        arr = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        boolean exists = false;
        for(int i: arr) {
            if(i==key) exists=true;
        }
        if(!exists) arr.add(key);
    }
    
    public void remove(int key) {
        boolean exists = false;
        for(int i: arr) {
            if(i==key) exists=true;
        }
        if(exists) arr.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        boolean exists = false;
        for(int i: arr) {
            if(i==key) exists=true;
        }
        if(exists) return true; else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */