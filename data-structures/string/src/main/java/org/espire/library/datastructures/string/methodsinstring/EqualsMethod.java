package org.espire.library.datastructures.string.methodsinstring;

public class EqualsMethod {
    public static void main(String[] args){
        String s1 = new String("coding");
        String s2 = new String("coding");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));//content comparision
    }
}
