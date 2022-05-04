package org.espire.library.arrays.typeofarrays.singledimensional;

import org.w3c.dom.ls.LSOutput;
import java.lang.*;
public class SingleDimensional {

    public static void main(String[] args) {

            //this is the declaration of array
            int arr[];
            //allocating memory for 7 integer
            arr = new int[7];
            arr[0]=11;
            arr[1]=22;
            arr[2]=33;
            arr[3]=44;
            arr[4]=16;
            arr[5]=19;
            arr[6]=20;


            //arr.length is defining the size of array

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" "+"is the at the index :"+i);
            }


        }

    }

