import java.util.LinkedHashSet;
import java.util.Set; 

public class LinkedHashSetExp1 {
    public static void main(String[] args) {
        Set<String> linkedHSet = new LinkedHashSet<String>();
        linkedHSet.add("JAVA");
        linkedHSet.add("C++");
        linkedHSet.add("JAVA");
        linkedHSet.add("PHP");

        for (String str : linkedHSet) {
            System.out.println(str);
        }
    }
}