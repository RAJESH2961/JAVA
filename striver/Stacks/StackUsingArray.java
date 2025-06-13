class StackImplementation {
    int top = -1;
    int size = 10;
    int st[] = new int[size];
    // 0 0 0 0 0 0 0 0 0 0
    // push
    void push(int x){
        // Edge case if stack is greather than size
        if(top > size){
            System.out.println("Cant push the stack is full");
        }
        top = top+1;
        st[top] = x;
    }

    void pop(){
        // Edge case 
        if(top == -1){
            System.out.println("Stack is aldready empty noe lements present");
        }
        top = top-1;
    }

    int size(){
        return top+1;
    }

    int top(){
        if(top == -1){
            System.out.println("No element present in stack");
            return -1;
        }
        return st[top];
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        StackImplementation st = new StackImplementation();

        System.out.println(st.top());
        System.out.println(st.size());
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        System.out.println(st.size());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        // st.pop();
        System.out.println(st.size());
    }
}