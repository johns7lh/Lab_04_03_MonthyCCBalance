public class Main
{
    public static void main(String[] args)
    {
        double creditBalance = 5000;

        double monthInterest = creditBalance * .17;
        System.out.println("The interest of your first month is: " + monthInterest);
        System.out.println("The interest of your second month is: " + monthInterest * 2);
    }
}