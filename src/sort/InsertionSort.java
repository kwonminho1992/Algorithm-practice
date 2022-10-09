package sort;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {1, 2, 10, 3, 16, 255, -1, -8, 23, 543, 1, 6, 5, 13};
    int[] result = sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(result[i] + ", ");
    }
  }

  public static int[] sort(int[] arr) {
    int length = arr.length - 1;
    for (int i = 0; i < length; i++) {
      int j = i;
      while (j >= 0 && arr[j] > arr[j + 1]) {
        swap(arr, arr[j], arr[j + 1], j);
        j--;
      }
    }
    return arr;
  }

  public static void swap(int[] arr, int firstNo, int secondNo, int index) {
    arr[index] = secondNo;
    arr[index + 1] = firstNo;
  }
}
