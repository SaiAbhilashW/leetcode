import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
     public static void main(String[] args) {
        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        Map<String, List<String>> myMap = new HashMap<>();
        List<String> result = new ArrayList<String>();

        myMap.put("2", new ArrayList<String>(Arrays.asList("a","b","c")));
        myMap.put("3", new ArrayList<String>(Arrays.asList("d","e","f")));
        myMap.put("4", new ArrayList<String>(Arrays.asList("g","h","i")));
        myMap.put("5", new ArrayList<String>(Arrays.asList("j","k","l")));
        myMap.put("6", new ArrayList<String>(Arrays.asList("m","n","o")));
        myMap.put("7", new ArrayList<String>(Arrays.asList("p","q","r","s")));
        myMap.put("8", new ArrayList<String>(Arrays.asList("t","u","v")));
        myMap.put("9", new ArrayList<String>(Arrays.asList("w","x","y","z")));

        ///// build the result
        for(int i=0, i < digits.length()-1;i++){
            String num1 = digits.charAt(i);
            for(int j=i+1;j<digits.length();j++){
                String num2 = digits.charAt(j);
                if(num1 != num2){
                    
                }
            } 
        }


        System.out.println(myMap.get("4"));
        return result;
    }
}