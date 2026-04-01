
import java.util.*;
class Main {
    public static int fab(int n){
        int a = 0;
        int b = 1;
        int i = 0;
        if(n <= 1){
            return 0;
        }
        while(i != n){
            int c= a+b;
            a = b;
            b = c;
            i++;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fab(n));
        }
    }
