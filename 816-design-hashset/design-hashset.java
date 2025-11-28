class MyHashSet {
    private int n;
    private List<List<Integer>> l;

    public MyHashSet() {
        n=1000;
        l=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            l.add(new LinkedList<>());
        }
    }
    
    public void add(int key) {
        int i=hash(key);
        List<Integer> l1=l.get(i);
        if(!l1.contains(key)){
            l1.add(key);
        }
    }
    
    public void remove(int key) {
        int i=hash(key);
        List<Integer> l1=l.get(i);
        l1.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int i=hash(key);
        List<Integer> l1=l.get(i);
        return l1.contains(key);
    }
    private int hash(int key){
        return key%n;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashhashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */