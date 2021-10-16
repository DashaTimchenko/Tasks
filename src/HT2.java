import QueueStack.OurQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HT2 {
    public static void main(String[] args) {
        HT24();
    }

    private static void HT2() {
        Scanner in = new Scanner(System.in)/*.useDelimiter( "\n" )*/;
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        int tmpIndex = in.nextInt() - 1, tmpVar = a[tmpIndex];
        for (int i = tmpIndex - 1; i >= 0; i--)
            a[i + 1] = a[i];
        a[0] = tmpVar;
//        System.out.println( Arrays.toString( a ) );
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void HT12() {
        Scanner in = new Scanner(System.in);
        String podText = in.next();
        String text = in.next();
        int i, isExist = podText.length();
        for (i = 0; i < text.length() - podText.length(); i++) {
            for (int j = podText.length() - 1; j >= 0; j--) {
                System.out.print(podText.charAt(j));
                if (text.charAt(j + i) == podText.charAt(j))
                    isExist--;
                else {
                    isExist = podText.length();
                    break;
                }
            }
            if (isExist == 0)
                break;
        }
        if (isExist == 0)
            System.out.println("\n" + ++i);
        else
            System.out.println("\n" + 0);
    }

    private static void HT14() {
        Scanner in = new Scanner(System.in);
        String podText = in.next();
        String text = in.next();
        int i, isExist = podText.length(), countOfCompare = 1;
        boolean found = false;
        for (i = 0; i < text.length() - podText.length(); i++) {
            for (int j = podText.length() - 1; j >= 0; j--) {
                countOfCompare++;
                if (text.charAt(j + i) == podText.charAt(j))
                    isExist--;
                else {
                    isExist = podText.length();
                    break;
                }
            }
            if (isExist == 0) {
                System.out.printf("%s ", i + 1);
                isExist = podText.length();
                found = true;
            }
        }
        if (found)
            System.out.println("\n" + countOfCompare);
        else
            System.out.printf("0\n%s", countOfCompare);
    }

    private static void HT20() {

        Scanner in = new Scanner(System.in);
        List<Integer> q = new LinkedList<>();
        int length = 0;
        String command = in.next();
        while (!command.toUpperCase().equals("exit".toUpperCase())) {
            switch (command.toUpperCase()) {
                case "PUSH_FRONT": {
                    try {
                        q.add(0, in.nextInt());
                        length++;
                        System.out.printf("%s\n", "OK");
                    } catch (Throwable error) {
                        System.out.println("ERROR: Not number!");
                    }
                    break;
                }
                case "PUSH_BACK": {
                    try {
                        q.add(in.nextInt());
                        length++;
                        System.out.printf("%s\n", "OK");
                    } catch (Throwable error) {
                        System.out.println("ERROR: Not number!");
                    }
                    break;
                }
                case "POP_FRONT": {
                    if (length > 0) {
                        length--;
                        System.out.println(q.get(0));
                        q.remove(length);
                    } else
                        System.out.println("we are empty!");
                    break;
                }
                case "POP_BACK": {
                    if (length > 0) {
                        length--;
                        System.out.println(q.get(length));
                        q.remove(length);
                    } else
                        System.out.println("we are empty!");
                    break;
                }
                case "BACK": {
                    System.out.println(q.get(length - 1));
                    break;
                }
                case "FRONT": {
                    System.out.println(q.get(0));
                    break;
                }
                case "SIZE": {
                    System.out.printf("size = %s\n", length);
                    break;
                }
                case "CLEAR": {
                    q = new LinkedList<>();
                    System.out.println("ok");
                    length = 0;
                    break;
                }
                default: {
                    System.out.println("ERROR: Unknown command!");
                }
            }
            command = in.next();
        }
        System.out.println("Bye!");
    }

    private static void HT24() {

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String[] input = in.next().split(" ");
        ArrayList<Integer> st = new ArrayList<>();
        for (String s : input) {
            try {
                switch (s) {
                    case "+":
                        st.set(st.size() - 2, st.get(st.size() - 2) + st.get(st.size() - 1));
                        st.remove(st.size() - 1);
                        break;
                    case "-":
                        st.set(st.size() - 2, st.get(st.size() - 2) - st.get(st.size() - 1));
                        st.remove(st.size() - 1);
                        break;
                    case "*":
                        st.set(st.size() - 2, st.get(st.size() - 2) * st.get(st.size() - 1));
                        st.remove(st.size() - 1);
                        break;
                    default:
                        st.add(Integer.parseInt(s));
                        break;
                }
            } catch (Throwable th) {
                System.out.println("Postfix input was not correct!\nRead some wiki, please)");
                break;
            }
        }
        if (st.size() < 2)
            System.out.println(st.get(0));
    }

    private static void HT30() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input count of elements in Stack: ");
        int N = in.nextInt(), P, Q, K;
        ArrayList<Integer> listInt = new ArrayList<>();

        System.out.printf("Input %s elements you want remove: \n", N);
        for (int i = 0; i < N; i++)
            listInt.add(in.nextInt());

        System.out.print("Input element you want remove: ");
        P = in.nextInt();
        listInt.remove(P - 1);

        System.out.print("Input \"index\" and \"element\" to insert: ");
        Q = in.nextInt();
        K = in.nextInt();
        listInt.add(Q - 1, K);
        //System.out.println( Arrays.toString( listInt.toArray() ) );
        for (int i = 0; i < N; i++) {
            System.out.print(listInt.get(i) + " ");
        }
    }

    private static void HT16() {
        Scanner in = new Scanner(System.in);
        OurQueue tmp = new OurQueue();
        String command = in.next();
        while (!command.toUpperCase().equals("exit".toUpperCase())) {
            switch (command.toUpperCase()) {
                case "PUSH": {
                    try {
                        tmp.push(in.nextInt());
                    } catch (Throwable error) {
                        System.out.println("ERROR: Not number!");
                    }
                    break;
                }
                case "POP": {
                    tmp.pop();
                    break;
                }
                case "BACK": {
                    tmp.back();
                    break;
                }
                case "SIZE": {
                    tmp.size();
                    break;
                }
                case "CLEAR": {
                    tmp.clear();
                    break;
                }
                default: {
                    System.out.println("ERROR: Unknown command!");
                }
            }
            command = in.next();
        }
        System.out.println("Buy!");
    }

    private static void HT1_20() {

    }
}

