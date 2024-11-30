import java.util.*;

class InsertEle {
    int[] c;

    void setIntArray(int ch[]) {
        c = ch;
    }

    void insertValueOnIndex(int index, int insert) {
        int[] newarray = new int[c.length + 1];

        for (int i = 0; i < index; i++) {
            newarray[i] = c[i];
        }

        newarray[index] = insert;

        for (int i = index; i < c.length; i++) {
            newarray[i + 1] = c[i];
        }

        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i] + " ");
        }
    }
}

public class InsertElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int e1[] = new int[4];

        System.out.println("Enter four elements:");
        for (int i = 0; i < e1.length; i++) {
            e1[i] = sc.nextInt();
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter insert element: ");
        int insert = sc.nextInt();

        InsertEle e = new InsertEle();

        e.setIntArray(e1);

        e.insertValueOnIndex(index, insert);
    }
}
