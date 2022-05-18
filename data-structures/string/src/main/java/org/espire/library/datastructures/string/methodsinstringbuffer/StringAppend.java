package org.espire.library.datastructures.string.methodsinstringbuffer;

public class StringAppend {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");//mutable
        sb.append("world");
        System.out.println(sb);
    }
}
