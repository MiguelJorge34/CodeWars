import java.util.*;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      HashMap < Character, Integer> available = new HashMap<>();
      
      
      for(int i = 0; i < str1.length(); i++){
        if(available.containsKey(str1.charAt(i))){
          available.put(str1.charAt(i),available.get(str1.charAt(i))+1);
        }
        else{
          available.put(str1.charAt(i),1);
        }
          
      }
      System.out.println(available);
      
      for(int i = 0; i < str2.length() ; i++){
        if(!available.containsKey(str2.charAt(i)) ){
          return false;
        }
        else if(available.get(str2.charAt(i))==0){
          return false;
        }
        else{
          available.put(str2.charAt(i),available.get(str2.charAt(i))-1);
        }
         
      }
      return true;
    }
}
