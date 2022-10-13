package sort;

public class ShellSort {
  public static void main(String[] args) {
    int[] arr = {12, 954, 1, 977, 34, 990, 100, 45, 97, 2, 41, 96, 105, 204, 2, 33, 6, 32, 423, 421,
        399, 120, 126, 101, 107, 3, 999, 23};
    sort(arr);
  }

  public static void sort(int[] arr) {
    int length = arr.length;
    for (int gap = length / 2; gap >= 1; gap /= 2) {
      for (int i = gap; i < length; i++) {
        int j = i - gap;
        while (j >= 0 && j < length && arr[j] > arr[j + gap]) {
          int temp = arr[j];
          arr[j] = arr[j + gap];
          arr[j + gap] = temp;
          j = j - gap;
        }
      }

      // gap에 따른 현재 정렬 상태 출력
      System.out.print("gap : " + gap + " - [");
      for (int i = 0; i < length; i++) {
        System.out.print(arr[i] + ", ");
      }
      System.out.print("]\n");
    }
  }
}
