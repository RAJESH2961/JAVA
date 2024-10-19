public class recursion {
    int cnt = 0;

    void prints() {
        if (cnt == 3) {
            return;
        }
        System.out.println(cnt);

        cnt += 1;
        prints();  // Recursive call
    }

    public static void main(String[] args) {
        recursion recursion = new recursion();  // Create an instance of the Recursion class
        recursion.prints();  // Call the prints() method
    }
}
