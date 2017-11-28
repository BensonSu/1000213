import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n%400==0)
            System.out.println("Bissextile Year");
        else if(n%100==0)
            System.out.println("Common Year");
        else if(n%4==0)
            System.out.println("Bissextile Year");
        else
            System.out.println("Common Year");
    }
}


