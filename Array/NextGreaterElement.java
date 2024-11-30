public class NextGreaterElement {

    public static void nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

           for (int i = 0; i < n; i++) {
            result[i] = -1;
        }


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j]; 
                    break;
                }
            }
        }

        
        System.out.print("The given array is: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

       
        System.out.println("Next Bigger Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Next bigger element of " + arr[i] + " in the array is: " + result[i]);
        }

        
        System.out.print("Next Bigger Elements Array:\n");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 9, 6, 13};
        nextGreaterElements(arr);
    }
}
