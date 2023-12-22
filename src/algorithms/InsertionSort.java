/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

/**
 *
 * @author ajinkyabhushan
 */
public class InsertionSort {
    public static int [] sort(int [] array){
        for (int i =1 ; i < array.length; ++i){
            int key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] =array[j];
                j = j-1;
            } 
            array[j+1] = key;
        }
        return array;
    }
}
