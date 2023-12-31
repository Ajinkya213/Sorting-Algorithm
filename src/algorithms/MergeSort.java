/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

/**
 *
 * @author ajinkyabhushan
 */
public class MergeSort {
    
  public static int[] mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
        return new int [] {-1};
    }

    int n = arr.length;
    int[] temp = new int[n];
    int currentSize;

    for (currentSize = 1; currentSize < n; currentSize *= 2) {
        for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currentSize) {
            int mid = Math.min(leftStart + currentSize - 1, n - 1);
            int rightEnd = Math.min(leftStart + 2 * currentSize - 1, n - 1);
            merge(arr, temp, leftStart, mid, rightEnd);
        }
    }
    
    return  arr;
}

    
      public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
    int i = left;
    int j = mid + 1;
    int k = left;

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= right) {
        temp[k++] = arr[j++];
    }

    for (i = left; i <= right; i++) {
        arr[i] = temp[i];
    }
}

}
