package Search;
public class LinearSearchExample1 {

    public static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;  // found
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};
        int key = 30;

        int result = linearSearch(arr, key);

        
    }
}