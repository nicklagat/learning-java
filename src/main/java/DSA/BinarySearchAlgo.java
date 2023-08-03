package DSA;

public class BinarySearchAlgo {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 8;

        int index = binarySearchAlgo(arr, target);
        if (index != -1) {
            System.out.println("Element was found at: " + index);
        }


    }


    public static int binarySearchAlgo(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
