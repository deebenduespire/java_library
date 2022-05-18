package org.espire.library.datastructures.string.programs.firstlettertouppercase;

public class ToUpperCase {

    public static void firstLetterToUpper(char[] array,int size){
        array[0]=(char)(array[0]-32);
        int i=1;
        while(i!=size){
            if(array[i]==' '){
                array[i+1]=(char)(array[i+1]-32);
            }
            ++i;
        }
        System.out.println(array);
    }
}
