import java.util.Random;

public class MaxAndMin {
    public static void main(){
        int min = 101;
        int max = 0;
        int i = 1;
        int num;
        Random r1 = new Random();
        System.out.println("SET OF NUMBERS:");

        while(i<=10){
            //Generating a random number between 1 and 100
            num = r1.nextInt(100) + 1;
            System.out.print(num + ",");
            //Comparing the numbers
            if(num<min) min = num;
            if(num>max) max = num;
            i ++;
        }

        System.out.println("\n\nThe largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
}


