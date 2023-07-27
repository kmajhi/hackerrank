import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String sum = "";

        int strLength = A.length();

        for (int i = strLength-1; i>=0; i--){
            sum = sum + A.charAt(i);
        }

        if (A.toLowerCase().equals(sum.toLowerCase())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
