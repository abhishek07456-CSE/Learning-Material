package Data_Structure.String;

import java.util.LinkedHashMap;

public class LongestSubstringNonRepeating {
    public static int longestString(String s){
        LinkedHashMap <Character , Integer> map = new  LinkedHashMap <Character , Integer>();
        //abba
        int max = 1 , st = 0 , n = s.length() ,l = 0 ,start = 0;
        if(n ==0 ) return 0;

        for( int i = 0 ; i < n ; i++){
            if(map.get(s.charAt(i))==null){
              map.put(s.charAt(i),i);
            }else{
             //ignore if after staring point eg abba st point is 2 when a repeated so we can add a current substring
             //current element index must be greater then starting point eg a is repeated at last index but at this point st point from b ie. 2 index and last index of a is 1 , so we can add a into current substring
             if(map.get(s.charAt(i)) >= st){
                  l =  i - st;
                  if(l > max){
                      max = l;
                      start = st;
                  }
                  st = map.get(s.charAt(i)) + 1; //st point after  repeated string eg [dvfd] so [vdf] will next string for check because d  is repated  so next substring is last string + 1 postition
             }
             map.replace(s.charAt(i), i);

            }
        }
       l = n - st;
       if(l > max){
             max = l;
            start = st;
       }
       return max;
    }
    public static void main(String[] args) {
        System.out.println(longestString("abba"));
    }

}
