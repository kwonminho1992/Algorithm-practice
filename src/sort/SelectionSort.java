package sort;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {1, 2, 10, 3, 16, 255, -1, -8, 23, 543, 1, 6, 5, 13};
    int[] result = sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(result[i] + ", ");
    }
  }

  public static int[] sort(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      int min = arr[i];
      int j = i;
      int index = i;
      for (; j < length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          index = j;
        }
      }
      arr[index] = arr[i];
      arr[i] = min;
    }
    return arr;
  }

}
