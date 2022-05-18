package org.espire.library.datastructures.string.programs.lowertouppercase;

public class LowerToUpper {
    public static void convertToUpper(char[] array,int size){
        int i=0;
        while(i!=size){
            if(array[i]!=' ') {
                array[i] = (char) (array[i] - 32);
            }
            ++i;
        }
        System.out.println(array);

    }
}
