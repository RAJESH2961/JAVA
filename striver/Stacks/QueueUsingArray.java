class queueImplementation {
    int size = 10;
    int currSize = -1;
    int queue[] = new int[size];
    int start = -1;
    int end = -1;

      void push(int x){
        if(currSize == size){
            System.out.println("Queue is full");
        }
        if(currSize == 0){
            start = 0;
            end = 0;
        }
        else{
            end = (end+1) % size;
        }
        queue[end] = x;
        currSize = currSize+1;
      }

      void pop(){
        if(currSize == 0){
            System.out.println("No elements in queue");
        }
        int ele = queue[start];
        if(currSize == 1){
            start = 0;
            end = 0;
        } else {
            start = (start + 1) % size;
        }
        currSize -=1;
      }

      int top(){
        if(currSize == 0){
            System.out.println("No elements present in the queue");
        }
        return queue[start];
      }
      int getSize(){
        return currSize;
      }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        queueImplementation obj = new queueImplementation();

        obj.push(10);
        obj.push(10);
        obj.push(10);
        obj.push(10);
        System.out.println(obj.getSize());
    }
}
