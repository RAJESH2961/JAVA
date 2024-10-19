public class Datatypes_with_sizes {

    public static void main(String[] args) {
        // 1 byte = 8 bits
        //The Datatype.SIZE gives o/p in bits we need to divide/8 to get in bytes
        //Wrapper class int ->Integer
        long data = 122121;
        System.out.println(data);
        System.out.println("Size of Integer Datatype is " +(Integer.SIZE/8) + " Bytes");
        System.out.println("Size of Long Datatype is " +(Long.SIZE/8) + " Bytes");
    }
    
}
