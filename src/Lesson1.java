import java.util.Scanner;

public class Lesson1 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Task6();
    }

    public static void Task10() { // 	10: Неубывающая подпоследовательность
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int count = 0;
        a = in.nextInt();
        do {
            b = a;
            count++;
            a = in.nextInt();
        } while (a >= b);
        System.out.print(count);
    }

    public static void Task12() {  //	12: Второй максимум
        Scanner in = new Scanner(System.in);
        int a;
        int max1;
        int max2 = -1001;
        max1 = in.nextInt();
        while (true) {
            a = in.nextInt();
            if (a == 0) break;
            else if (a > max1) {
                max2 = max1;
                max1 = a;
            } else if (a > max2 && a != max1) {
                max2 = a;
            }
        }
        System.out.print(max2);
    }

    public static void Task14() {  // Количество отрицательных между нечётными
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

    }

    public static void Task2() {    // Степень двойки
        Scanner in = new Scanner(System.in);
        int k = 0;
        double res = 0;
        double two = 2.0;
        int n = in.nextInt();
        if (n != 1) {

            while (res < n) {
                k++;
                res = Math.pow(two, k);

            }
        }
        System.out.print(k);
    }


    public static void Task20() { // Следующий после минимального
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
                min2 = 0, mostMin = 0, index = 0, mostIndex = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            mostMin = array[i];
            min2 = array[i + 1];
            if (mostMin != min2) {
                if (mostMin > min2) {
                    mostMin = array[i + 1];
                    mostIndex = i + 1;
                    min2 = array[i];

                }
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] < mostMin) {
                min2 = mostMin;
                index = mostIndex;

                mostMin = array[i];
                mostIndex = i;
            } else if (array[i] < min2 && array[i] > mostMin) {
                min2 = array[i];
                index = i;
            }
        }
        System.out.print(min2 + " " + index);
    }

    public static void Task22() { //Удаление элемента
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int b = in.nextInt();

    }

    public static void DoubleMass() {
        Scanner in = new Scanner(System.in);

        int RowsN;
        RowsN = in.nextInt();
        int CollsN;
        CollsN = in.nextInt();
        int[][] mass = new int[RowsN][CollsN];
        for (int i = 0; i < RowsN; i++) {
            for (int j = 0; j < CollsN; j++) {
                mass[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < RowsN; i++) {
            for (int j = 0; j < CollsN; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void Task30() {
        Scanner in = new Scanner(System.in);
        int n = 12;
        int[] a = {1, 4, 2, 18, -22, 0, -11, 0, 5, 17, -92, -88};
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if ((a[j - 1] >= 0 && a[j] > 0 && a[j - 1] < a[j]) || // Два положительных => сортируем по убыванию
                        (a[j - 1] <= 0 && a[j] < 0 && a[j - 1] > a[j]) ||// два отрицательных => по возрастанию
                        (a[j - 1] * a[j] <= 0 && a[j - 1] > a[j])) // положительное и отрицательное => положительное впереди
                {
                    int T = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = T;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void Task4() {
        Scanner in = new Scanner(System.in);
        String n;
        n = in.next();
        char[] strToArray=n.toCharArray();
        System.out.println("***");
        for (char c : strToArray) {
            System.out.println("*" +c+ "*");
        }
        System.out.println("***");
       /* int m = 0;
        while (n != 0) { //переворот числа
            m = m * 10 + n % 10;
            n /= 10;
        }
        System.out.println(m);
        System.out.println("***");
        if (m < 0) {
            System.out.println("*-*");
        }
        while (m != 0) {
            int current = Math.abs(m % 10); // разбиение перевернутого числа на цифры
            System.out.println("*" + current + "*");
            m /= 10;
        }
        System.out.println("***");*/
    }
    public static void Task6() {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=1;
        int result;
        do {
            k++;
        } while (n % k != 0);
        System.out.println(k);
    }
}


