public class Test {
    static final int NUM = 12;

    public static void main(String[] args) {
        perimeter(NUM, 12,8);

    }
    public static int perimeter(int a, int b) {
        return 2 * (a + b);
    }
    public static int perimeter(int a, int b, int c) {
        int result = 0;
        if (isAmore(a,b,c)) {
            System.out.println("It isn't  triangle");
        } else if ( isBmore(a,b,c)) {
            System.out.println("It isn't  triangle");
        } else if (isCmore(a,b,c)) {
            System.out.println("It isn't  triangle");
        }
        else {
           result = a + b + c;
            System.out.println(result);
        }
        return result;
    }
    public static boolean isAmore(int a, int b, int c) {
        return (a > b +c );
    }
    public static boolean isBmore(int a, int b, int c) {
        return (b > a + c);
    }
    public static boolean isCmore(int a, int b, int c) {
        return (c > a + b);
    }
}
