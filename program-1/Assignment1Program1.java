import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("BBBBBBBBBBB              SSSSSSS");
    System.out.println("BB       BBB           SSS     SS ");
    System.out.println("BB       BBB          SSS         ");
    System.out.println("BB      BBB             SSS");
    System.out.println("BBBBBBBBBB                SSS");
    System.out.println("BB        BB                SSS");
    System.out.println("BB          BB                 SS");
    System.out.println("BB          BB                  SS");
    System.out.println("BB        BB          SS      SS");
    System.out.println("BBBBBBBBBBB              SSS");



    String response;
    String threecharacters;
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter a 5 character word:");
    
    response = scan1.nextLine();
    threecharacters = response.substring(1, 4);
    
    scan1.close();

StringBuilder repeatedbackwards = new StringBuilder(threecharacters);
String completedword = repeatedbackwards.reverse().toString();
System.out.println(completedword);


    int temperature;
    double fraction;
    fraction = (5.0/9.0);
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number in Fahrenheit");
    temperature = scan.nextInt();
    System.out.println("Temperature in Celsius: " + (temperature - 32) * fraction);

    scan.close();


    Random random = new Random();
    int min = 32;
    float max = 16384;

    int RandomNumber = min + random.nextInt(max - min + 1);
    System.out.println("Random number between " + min + " and " + max + " ; " + RandomNumber);



  }
}
