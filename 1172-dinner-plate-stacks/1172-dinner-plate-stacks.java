class DinnerPlates {
    ArrayList<Stack<Integer>> plate;
    TreeSet<Integer> set;
    int capacity;
    public DinnerPlates(int capacity) {
        plate = new ArrayList<>();
        set = new TreeSet<>();
        this.capacity = capacity;
    }
    
    public void push(int val) {
        int index = 0;
        if(plate.size() == 0)
        {
            plate.add(new Stack<Integer>());
        }
        if(set.size() == 0)
        {
            index = plate.size() - 1;
            if(plate.get(index).size() == capacity)
            {
                index = index + 1;
                plate.add(new Stack<Integer>());
            }
        }
        else
        {
            index = set.first();
            if(plate.get(index).size() == capacity - 1)
            {
                set.remove(index);
            }
        }
        plate.get(index).add(val);
    }
    
    public int pop() {
        int right = plate.size() - 1;
        while(right >= 0 && plate.get(right).size() == 0)
        {
            plate.remove(right);
            if(set.contains(right))
            {
                set.remove(right);
            }
            right--;
        }
        if(right < 0)
        {
            return -1;
        }
        int element = plate.get(right).pop();
        return element;
    }
    
    public int popAtStack(int index) {
        if(index >= plate.size())
        return -1;
        if(plate.get(index).size() == 0)
        return -1;

        int element = plate.get(index).pop();
        if(!set.contains(index))
        {
            set.add(index);
        }
        return element;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */