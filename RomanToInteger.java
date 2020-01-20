class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        
        romanValues.put('I', 1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);
        char[] charArr = s.toCharArray();
        
        int resultSum = 0;
        for(int i = 0; i < s.length() - 1;i++){
            int one = romanValues.get(charArr[i]);
            int two = romanValues.get(charArr[i+1]);
            if(one < two){
                resultSum -= one;
            } else resultSum += one;
        }
        
        return  resultSum + romanValues.get(charArr[s.length() - 1]);

    }
}