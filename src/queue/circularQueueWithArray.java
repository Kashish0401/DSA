class MyCircularQueue {

    private int[] queue;
    private int size, front, rear, totalSize;
    
    public MyCircularQueue(int k) {
        queue= new int[k];
        size=0;
        front=0;
        rear=-1;
        totalSize=k;
    }
    
    public boolean enQueue(int value) {
        if(size==totalSize)
            return false;
        if(rear== totalSize-1 && queue[0]==-1)
            rear=-1;
        queue[++rear]= value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0)
            return false;
        queue[front++]=-1;
        if(front==totalSize)
            front=0;
        size--;
        return true;
    }
    
    public int Front() {
        if(size!=0)
            return queue[front];
        return -1;
    }
    
    public int Rear() {
        if(rear!=-1)
            return queue[rear];
        return -1;
    }
    
    public boolean isEmpty() {
        if(size==0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(size==totalSize)
            return true;
        return false;
    }
}
