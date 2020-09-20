import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mommifier {

    String convert(String str) {
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        counter.put('a', 0);
        counter.put('e', 0);
        counter.put('i', 0);
        counter.put('o', 0);
        counter.put('u', 0);

        for (int i = 0; i < str.length(); ++i) {
            char temp = str.charAt(i);
            if (counter.containsKey(temp)) counter.put(temp, counter.get(temp) + 1);
        }

        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < str.length() - 1; ++i) {
            res.append(str.charAt(i));
            if (!counter.containsKey(str.charAt(i))) continue;
            int a = counter.get(str.charAt(i));
            int b = str.length();
            double c =  (double)a / b ;
            if (str.charAt(i) == str.charAt(i+1) && c > 0.3) res.append("mommy");
        }

        res.append(str.charAt(str.length() - 1));

        return res.toString();
    }
}
