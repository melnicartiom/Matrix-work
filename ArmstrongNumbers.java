import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArmstrongNumbers {

    public static void main(String[] args) throws IOException{
        armstrongNumber();
    }

    public static boolean armstrongNumber () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        String numberToString = Integer.toString(number);

        int temp = number;
        int numElem;
        int summ = 0;


        while (number > 0){
            numElem = number % 10;
            number /= 10;
            summ += Math.pow(numElem, numberToString.length());
        }

        if (temp == summ){
            System.out.println("Введённое число является числом Армстронга");
        }
        else {
            System.out.println("Введённое число НЕ является числом Армстронга");
        }
        return true;
    }
}
