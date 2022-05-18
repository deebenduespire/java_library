package org.espire.library.datastructures.string.methodsinstring;

public class StringConcat {
    public static void main(String[] args){
        String s = new String("Hello");//immutable
        s.concat("world");
        System.out.println(s);
    }
}
