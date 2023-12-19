/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

/**
 *
 * @author ajinkyabhushan
 */
public class SelectionSort {
    public static void Sort (int arr[]){
            //for loop for going from index = 0 to index = n - 1
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;  
            //for loop to find the next minimum value in the array starting from index 1
            for (int j = i+1; j < arr.length ; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i : arr){
            System.out.println(i+" ");
        }
        
       } 
    
    public static void SortDecrement (int arr[]){
        for (int i = 0 ; i < arr.length -1; i++){
            int max = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        
          for (int i : arr){
            System.out.println(i+" ");
        }
        
    }
    }
