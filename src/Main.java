import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Введіть натуральне число: ");
        double n = Math.floor(myObj.nextDouble());
        double S = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                S += 1/Math.pow(2, i);
            }
            if(i % 2 == 1){
                S -= 1/Math.pow(2, i);
            }
        }
        System.out.println("S =  " + S);
    }
}

