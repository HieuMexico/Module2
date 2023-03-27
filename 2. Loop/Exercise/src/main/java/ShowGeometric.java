import java.util.Scanner;

public class ShowGeometric {
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            boolean checkActionMenu = false;
            do {
                System.out.println("Chọn chức năng cần in ra");
                System.out.println("Nhấn 1: In hình vuông sao");
                System.out.println("Nhấn 2: In tam giác sao trên - trái");
                System.out.println("Nhấn 3: In tam giác sao trên - phải");
                System.out.println("Nhấn 4: In tam giác cân");
                int actionMenu = scanner.nextInt();

                switch (actionMenu) {
                    case 1:
                        printSquareStar();
                        break;
                    case 2:
                        printTriangleStarBelowLeft();
                        break;
                    case 3:
                        printTriangleStarTopLeft();
                        break;
                    case 4:
                        printIsoscelesTriangle();
                }
                checkActionMenu = true;
            } while (checkActionMenu);
        }

        public static int size = 5  ;


        public static void printTriangleStarTopLeft() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }

        public static void printSquareStar() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        public static void printTriangleStarBelowLeft() {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        public static void printIsoscelesTriangle() {
            for (int i = 0; i < size; i++) {
                for (int j = size - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}