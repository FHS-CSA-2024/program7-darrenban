//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter schrute-bucks:");
        double schruteBucks = input.nextInt();
        System.out.print("Enter klevins:");
        double klevins = input.nextInt();
        System.out.print("Enter stanley-nickels:");
        double stanleyNickels = input.nextInt();
        
        //calc
        klevins = klevins + stanleyNickels / 12.0;
        schruteBucks = schruteBucks + klevins / 20.0;
        schruteBucks = Math.round(100.0 * schruteBucks) / 100.0;
        
        
        System.out.println("Decimal schrute-bucks = $" + schruteBucks);
        
    
    }
}

//Paste console output below:
/*
Enter schrute-bucks:7
Enter klevins:17
Enter stanley-nickels:9
Decimal schrute-bucks = $7.89

*/
