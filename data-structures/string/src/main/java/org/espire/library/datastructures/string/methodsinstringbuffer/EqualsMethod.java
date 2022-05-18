package org.espire.library.datastructures.string.methodsinstringbuffer;

public class EqualsMethod {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("Coding");
        StringBuffer sb2 = new StringBuffer("Coding");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));//reference comparision
    }
}
