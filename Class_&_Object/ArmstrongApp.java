class Armstrong {
    int n;

    void setNum(int no) {
        n = no;
    }

    Boolean isArmstrong() {
        int temp = n, sum = 0;
        int digits = 0;
        boolean flag = false;

        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == n) {
            flag = true;
        }

        return flag;
    }
}

public class ArmstrongApp {
    public static void main(String[] args) {
        Armstrong arm = new Armstrong();
        arm.setNum(1634);

        boolean flag = arm.isArmstrong();

        if (flag) {
            System.out.println(arm.n + " is an Armstrong number");
        } else {
            System.out.println(arm.n + " is not an Armstrong number");
        }
    }
}
