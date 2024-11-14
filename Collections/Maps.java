import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("Rajesh", 97);
        student.put("Balaji", 100);
        student.put("Rajesh", 92);
        student.put("Monika", 96);
        System.out.println(student.keySet());
        System.out.println(student.values());

        // Iterating over loop
        for (String name : student.keySet()) {
            System.out.println(name + ":" + student.get(name));
        }
    }

}
