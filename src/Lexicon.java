import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Lexicon {
    public static void Lexicon(){
        HashMap<String, List<String>> lex = new HashMap<>();

        lex.put("hej", new ArrayList<String>(Arrays.asList("hi", "hello", "hi")));
        lex.put("middag", new ArrayList<String>(Arrays.asList("dinner", "supper")));


        for (String key : lex.keySet()) {
            System.out.println(key + " " + lex.get(key));
        }
    }
}
