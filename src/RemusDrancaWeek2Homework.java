import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class RemusDrancaWeek2Homework {

    public static void main(String[] args) {
        // Exercise 1
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1 + s2);

        //  Exercise 2
        String myString = "anna";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

        //  Exercise 3
        String str1 = "";
        List<String> str2 = new ArrayList<>();
        List<String> str3 = new ArrayList<>();
        str3.add("AdsaAdsX");
        str3.add("fsdfFSJKhk");
        str3.add("gdgfdTEgddGDX");
        for (String word : str3) {
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")
                    || word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
                System.out.println(word.toLowerCase() + str1);
            } else {
                System.out.println(word.toUpperCase() + str2);
            }
            if (word.contains("x") || word.contains("X") || word.length() < 3) {
                String r = word.replace("//","skipped");
                System.out.println(r + (" skipped"));
            }
        }
        /* Exercise 4 */
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Jhon", "jhon@test.com");
        map.put("Doe", "doe@test.com");
        map.put("Obama", "obama@test.com");

        System.out.println("Map size " + map.size() + " elements.");

        System.out.println("Is \"Obama\" in this map? : " + map.containsKey("Obama"));
        for (String i : map.keySet()) {
            if (map.containsKey("Doe")) {
                System.out.println("His email is: " + map.get(i));
            } else {
                System.out.println("No email");
            }
        }
            map.remove("Obama", "obama@test.com");
            System.out.println("Updated list: " + map);

            SortedSet<String> keySet = new TreeSet<>(map.keySet());
            System.out.println("Sorted map " + keySet);

    }
}
