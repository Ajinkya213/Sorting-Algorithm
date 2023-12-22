/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithms;

/**
 *
 * @author ajinkyabhushan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr [] = new int [] {17,211,4,6};
        BubbleSort sort = new BubbleSort();
        arr = sort.sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
}
