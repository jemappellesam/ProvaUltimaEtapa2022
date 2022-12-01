import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number= scanner.nextLong();
        if(number<50 || number>100){
            System.out.println("Número inválido");

        }
        else {
            System.out.println(calculate(number));
        }

    }
    public static long calculate(long number){
        if(number==50){
            return number;
        }

            return number + calculate(number -1);






    }
}
