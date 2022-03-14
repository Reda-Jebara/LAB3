import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TASK_1

{
    public static void main(String[] args) throws IOException{

        float firstNumberReda ,SecondNumberReda,sum,Sub,product,quotient;

        BufferedReader rD = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter ur first number");


        firstNumberReda=Float.parseFloat(rD.readLine());
        System.out.println("Please enter ur Second number");


        SecondNumberReda=Float.parseFloat(rD.readLine());

        sum=firstNumberReda + SecondNumberReda;
        Sub=firstNumberReda - SecondNumberReda;
        product=firstNumberReda*SecondNumberReda;
        quotient=firstNumberReda/SecondNumberReda;

        System.out.println("The Sum of th numbers is : "+sum);
        System.out.println("The Subtraction of the numbers is : "+Sub);
        System.out.println("The product of the numbers is : "+product);
        System.out.println("The quotient of th numbers s : "+quotient);

    }
}
