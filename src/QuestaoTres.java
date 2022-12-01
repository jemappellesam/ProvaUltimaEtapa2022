import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if(number<50 || number>100){
            System.out.println("Número inválido");
        }

        else {
            printnumber(number);
        }
    }
    public static int printnumber(long n){

        if(n == 50){

            return 50;

        }
        if((n%2)!=0){
            System.out.println(n);
            return printnumber(n-1);

        }
        if((n % 2) == 0){

            System.out.println(n);

        }

        return printnumber(n-2);

    }
    }
