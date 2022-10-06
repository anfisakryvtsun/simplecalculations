import java.util.Scanner;
public class Inches {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.print("Input inches: ");
    double inches = input.nextDouble();

    double  meters =(inches * 0.0254);
    System.out.println(inches + " Inches is equal to " + meters + " meters");
}
}
