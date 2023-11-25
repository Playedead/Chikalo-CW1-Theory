import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int[] destination = getNewArray(arr, 3, 7);
    System.out.println(Arrays.toString(destination));
    int[] destination2 = getNewArray(arr, 0, 7);
    System.out.println(Arrays.toString(destination2));
  }
  private static int[] getNewArray(int[] arr, int start, int end) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        arr[i]++;
      }
    }
    int destinationLength = end - start + 1;
    int[] destination = new int[destinationLength];
    System.arraycopy(arr, start, destination, 0, destinationLength);
    return destination;
  }
}


