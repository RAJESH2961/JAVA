public class Addition {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int m = A.size();  // Number of rows
        int n = A.get(0).size();  // Number of columns (Assuming all rows are of equal length)
        
        // Iterating through each element of the 2D ArrayLists
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Adding corresponding elements of A and B and updating A
                int sum = A.get(i).get(j) + B.get(i).get(j);
                A.get(i).set(j, sum);  // Use set() to update the value at index (i, j)
            }
        }
        return A;  // Return the updated ArrayList A
    }
}