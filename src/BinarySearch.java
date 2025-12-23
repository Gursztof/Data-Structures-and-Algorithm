import java.util.Arrays;

public class BinarySearch {
    private int high;
    private int low;
    private int middle;
    private final int[] array;

    public BinarySearch(int[] array) {
        this.low = 0;
        this.high = 0;
        Arrays.sort(array);
        this.array = array;
    }

    public int search(int target) {
        high = array.length;
        int attempts = 0;

        while (array[middle] != target) {

            attempts++;
            System.out.println("try: " + attempts + ", middle: " + middle);
            // Set middle
            middle = low + (high - low) / 2;

            // Target is bigger
            if (array[middle] < target) {
                low = middle;
            }
            // Target is lower
            else if (array[middle] > target) {
                high = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
