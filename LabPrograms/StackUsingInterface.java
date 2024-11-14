interface Stack{
    void push(int item);
    int pop();
}

class ArrayStack implements Stack{
    int stack[];
    int top;
    ArrayStack(int size){
        stack = new int[size];
        top = -1;
    }
    public void push(int item){
        if(top == stack.length -1){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = item;
            System.out.println("Pushed Item :"+item);
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stack[top--];
        }
    }

}

public class StackUsingInterface {
    public static void main(String[] args) {
        ArrayStack obj = new ArrayStack(5);
        obj.push(10);
        obj.push(10);
        obj.push(10);
        System.out.println(obj.pop());

    }
    
}
