import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.System.out;

public class Parse {

    public static String formater(String[] lines) {
        StringBuilder value = new StringBuilder();
        value.append(lines[1]);
        value.append("(" + lines[2] + ")");
        value.append(" from " + lines[3] + " -");
        value.append(" (user no: " + lines[0] + ")");
        return value.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line;
        Map<Integer, String> map = new HashMap<>();
        int counter = 0;
        Boolean flag = true;
        String[] lines;
      
        while (s.hasNext()) {
            line = s.nextLine();
            if (counter == 0) {
                lines = line.split(" ");
                counter = Integer.parseInt(lines[0]);
                flag = lines[1].equals("REMOVED");
            } else {
                if (flag) {
                    map.remove(line);
                    counter--;
                } else {
                    lines = line.split(";");
                    map.put(Integer.parseInt(lines[0]), formater(lines));
                    counter--;
                }
            }
        }
      
        map.values().forEach(System.out::println);
    }
}
