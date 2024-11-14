import java.util.*;

public class List{
    public static void main(String[] args) {
        // ArrayList<String> l = new ArrayList<>();
        // or
        ArrayList<String> l = new ArrayList<>();
        l.add("Data");
        l.add("Demo");
        l.add("Ram");
        l.add("Sam");
        l.add("Sam");
        l.add("Jam");
        System.out.println("Size of the ArrayList After Adding Elements"+l.size());
        // System.out.println("Removed Element :"+l.remove("Data"));
        l.set(1,"Element Changed");
        System.out.println(l);
        System.out.println("Size of the ArrayList After Removing Elements"+l.size());
        l.remove("Data");
        l.clear();
        l.add("Demo");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Demo");
        System.out.println(l2.equals(l));
        System.out.println(l.hashCode());
        l.toString();
        // System.out.println(l.toString());
        System.out.println(l.addAll(l2));
        System.out.println(l);

        //creating Another Arraylist and passing the first Arraylist colllection into it
        ArrayList<String> alist2 = new ArrayList<>(l);
        // System.out.println("Second Array List "+alist2);

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Demo");
        ll.add("Demo");
        ll.add("Demo");
        ll.add("Demo");
        ll.add("Demo");
        ll.add("Demo");

        // Iterator<String> i = l.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
            
        // }

        Vector<Integer> vec = new Vector<>();
        for(int i = 10; i<=20; i++){
            vec.add(i);
        }
        vec.addFirst(1);
        vec.addLast(21);

        Stack<Integer> st = new Stack<>();
        st.capacity();
        System.out.println("Stack Capacity : "+st.capacity());
        for(int i=1; i<23; i++){
            st.add(i);
        }
        
        //Printing Stack Elements
        for(int s : st){
            System.out.println(s);
        }
        System.out.println("Stack Capacity : "+st.capacity());
        System.out.println("Peek Element"+st.peek());
        System.out.println("Popped Element"+st.pop());
        System.out.println( st.size());
       


    }
}