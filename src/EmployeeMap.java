import java.util.TreeMap;

public class EmployeeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "Diana");
        employeeMap.put(105, "Eve");

        System.out.println(employeeMap);

        System.out.println("First Key: " + employeeMap.firstKey());

        System.out.println("Last Key: " + employeeMap.lastKey());
    }
}
