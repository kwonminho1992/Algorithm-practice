package sort;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {1, 2, 10, 3, 16, 255, -1, -8, 23, 543, 1, 6, 5, 13};
    int[] result = sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(result[i] + ", ");
    }
  }

  public static int[] sort(int[] arr) {
    int length = arr.length;
    int innerLength = length - 1;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < innerLength; j++) {
        swap(arr, arr[j], arr[j + 1], j);
      }
      innerLength--;
    }
    return arr;
  }

  private static void swap(int[] arr, int firstNo, int secondNo, int index) {
    if (secondNo < firstNo) {
      arr[index] = secondNo;
      arr[index + 1] = firstNo;
    }
  }
}
