package dsa;

import java.util.*;

public class Arr {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String name = "Yuvanshandhar";
        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
     }
}
