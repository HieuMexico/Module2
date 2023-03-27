import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class BT1103 {
    public static Scanner scanner = new Scanner(System.in);
    static Integer[] arrA = {1, 2, 5, 2, 4};

    //    static Integer[] arrB = {3, 2, 8, 2, 4};
    static  Integer[] arr = {};

    static List<Integer> list = new ArrayList<>(Arrays.asList(arrA)); // Khai báo Mảng động. // Arrays.asList(): thêm mãng đã có vào trong mãng List
    public static void main(String[] args) {

        boolean checkActionMenu = false;
        do {
            System.out.println("Nhâp 1:Tính tổng các giá trị trong mảng");
            System.out.println("Đếm xem mảng có bao nhiêu số chẵn");
            System.out.println("Tìm giá trị nhỏ nhất trong mảng");
            System.out.println("Thêm phần tử vào mảng");
            System.out.println("Xóa phần tử khỏi mảng");
            System.out.println("Gộp 2 mảng a, b lại với nhau");
            int acctionMenu = scanner.nextInt();

            switch (acctionMenu) {
                case 1:
                    sumArray();
                    break;
                case 2:
                    countingEvenNumbers();
                    break;
                case 3:
                    smallestValue();
                    break;
                case 4:
                    addElement();
                    break;
                case 5:
                    removeElemant();
                    break;
//                case 6:
//                    mergeArray(arrA, arrB);
            }
            checkActionMenu = true;
        } while (checkActionMenu);
    }

    public static void sumArray() {
        int sum = 0;
        for (int i = 0; i < arrA.length; i++) {
            sum += arrA[i];
        }
        System.out.println(sum);
    }

    public static void countingEvenNumbers() {
        int count = 0;
        for (int i = 0; i < arrA.length; i++) {
            if(arrA[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void smallestValue() {
        int min = arrA[0];
        for (int i = 0; i < arrA.length; i++) {
            if (min > arrA[i]) {
                min = arrA[i];
            }
        }
        System.out.println(min);
    }

    public static void addElement() {
        System.out.print("Nhập phần tử muôn thêm vào: ");
        int phanTu = scanner.nextInt();
        list.add(phanTu);
        System.out.println(list);
    }

    public static void removeElemant(){
        System.out.println("Xóa phần tử ở vị trí: ");
        int phanTu = scanner.nextInt();
        list.remove(arrA[phanTu]);
        System.out.println(list);
    }

//    public static int[] mergeArray(Integer[] arrA, Integer[] arrB) {
//
//        int[] totals = new int[arrA.length + arrB.length];
//        for (int i = 0; i < arrA.length; i++) {
//            totals[i] = arrA[i];
//        }
//        for (int j = 0; j < arrB.length; j++) {
//            totals[arrA.length + j] = arrB[j];
//        }
//        System.out.println(totals);
//        return totals;
//    }
}
