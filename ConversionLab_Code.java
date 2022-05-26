import java.util.Scanner;

public class ConversionLab_Code
{
    public static void main(String[] args)
    {
        double Km, miles;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers");
        Km = i.nextDouble();
        i.close();

        miles = (Km * 0.621371);
        System.out.printf("%f Kilometers = %f Miles", Km, miles);
    }
}
