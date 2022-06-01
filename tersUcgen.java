import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args){

        // Girilen değere göre yıldızlarla ters üçgen çizme

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("N'i giriniz : ");
        n = inp.nextInt();
        for (int i = (n - 1); i >= 1; i--){
            for (int k = (n - i); k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = (2*i) - 1; j >=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
