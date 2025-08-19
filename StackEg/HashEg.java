package StackEg;

import java.util.HashSet;

public class HashEg {
    public static void main(String[] args) {
        HashSet<Integer> has = new HashSet<>();
        has.add(1);
        has.add(2);
        has.add(1);
        has.add(4);
        
        System.out.println(has.size());
        System.out.println(has);
    }
}
