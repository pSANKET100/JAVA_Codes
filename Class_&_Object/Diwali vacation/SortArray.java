class SortArr {
    private int array[];

    public void setArray(int a[]) {
        array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
    }

    public int[] getSortArray() {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
               
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}

public class SortArray {
    public static void main(String args[]) {
        SortArr s1 = new SortArr();
        int simpleArray[] = {4, 2, 3, 9, 7};

        s1.setArray(simpleArray);

        int[] sortedArray = s1.getSortArray();

        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
