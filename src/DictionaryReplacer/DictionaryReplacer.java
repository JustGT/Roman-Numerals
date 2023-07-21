package DictionaryReplacer;

import java.util.HashMap;
import java.util.Map;

public class DictionaryReplacer {


    public static void main(String[] args) {
        String str = "$temp$ here comes the name $name$";
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("temp", "temporary");
        dictionary.put("name", "John Doe");
        System.out.println(replace(str,dictionary));
    }

    public static String replace(String str, Map<String, String> dictionary) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$'){
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(j) == '$' && dictionary.containsKey(str.substring(i+1,j))){
                        String substring = str.substring(i,j+1);
                        str = str.replace(substring, dictionary.get(str.substring(i+1,j)));
                    }
                }
            }


        }
        return str;
    }
}
