public class Main {
    public static void main(String[] args) {

        // נחלק את התכנית שלנו לשני חלקים, פירמידה עליונה בעלת 7 שורות
        // ופירמידה תחתונה עם 6 שורות

        // חלק 1:
        int row = 7;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // חלק 2:
        int rows2 = 6;

        for (int i = 1; i <= rows2; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}