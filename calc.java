import java.util.*;

public class calc {
    public static void main(String[] args){
        double a, b, c, e = 0, x, y, z;
        int d;
        Scanner calc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        while(e == 0){
            System.out.println("\n1. Addition + \n2. Subtraction - \n3. Multipication * \n4. Division / \n5. Modulus % \n6. Hypotenuse \n7. Power of a Number \n8. Random Number \n9. Converter \n10. Armstrong Number \n11. Reverse a Number \n12. Exit \nEnter Your Choice: \n");
        d = calc.nextInt();
        switch(d){
            case 1:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nAddition\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a + b;
                System.out.println("\nThe Sum of " + a + " and " + b + " is " + c );
                break;
            case 2:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nSubtraction\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a - b;
                System.out.println("\nThe Difference Between " + a + " and " + b + " is " + c );
                break;
            case 3:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nMultipication\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a * b;
                System.out.println("\nThe Combination of " + a + " and " + b + " is " + c );
                break;
            case 4:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nDivision\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a / b;
                System.out.println("\nThe Divison of " + a + " and " + b + " is " + c );
                break;
            case 5:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nModulus\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a % b;
                System.out.println("\nThe Modulus of " + a + " and " + b + " is " + c );
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                System.out.println("Enter side x: ");
                x  = calc.nextDouble();
                System.out.println("\nEnter side y: ");
                y = calc.nextDouble();
                z = Math.sqrt((x * x) + (y * y));
                System.out.println("The Hypotenuse is " + z);
                break;
            case 7:
                System.out.print("\033[H\033[2J");
                Scanner pow = new Scanner(System.in);
                int base, exp, oexp, result = 1;
                System.out.println("Enter Base Number: ");
                base = pow.nextInt();
                System.out.println("Enter an Exponent: ");
                exp = pow.nextInt();
                oexp = exp;
                while(exp != 0){
                    result *= base;
                    --exp;
                }
                System.out.println("The Power of " + base + " Raised to " + oexp + " is " + result);
                break;
            case 8:
                System.out.print("\033[H\033[2J");
                int min, max;
                Scanner randN = new Scanner(System.in);
                System.out.println("Enter the min number: ");
                min  = randN.nextInt();
                System.out.println("Enter the max number: ");
                max = randN.nextInt();
                int randNumber = (int)(Math.random() * (max - min + 1) + min);
                System.out.println("Random Number Between " + min + " to " + max + " is " + randNumber);
                break;
            case 9:
                System.out.print("\033[H\033[2J");
                double f, cel; 
                int option;
                Scanner con = new Scanner(System.in);
                System.out.println("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius \nEnter Your Choice: ");
                option = con.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Enter Temperature in Celsius: ");
                        cel = con.nextDouble();
                        f = (cel * 9/5) + 32;
                        System.out.println("The Temperature of " + cel + " Celsius in Fahrenheit is: " + f);
                        break;
                    case 2:
                        System.out.println("Enter Temperature in Fahrenheit: ");
                        f = con.nextDouble();
                        cel = (f - 32) * 5/9;
                        System.out.println("The Temperature of " + f + " Fahrenheit in Celsius is: " + cel);
                        break;
                }
                break;
            case 10:
                System.out.print("\033[H\033[2J");
                int ce = 0, ae, temp, n;
                Scanner num = new Scanner(System.in);
                System.out.print("Enter number to be checked: ");
                n = num.nextInt();
                temp = n;
                while(n > 0){
                    ae = n % 10;
                    n = n/10;
                    ce = ce+(ae*ae*ae);
                }
                if(temp == ce){
                    System.out.println(temp+" is an Armstrong Number.");
                }else{
                    System.out.println(temp+" is not an Armstrong Number.");
                }
                break;
            case 11:
                System.out.print("\033[H\033[2J");
                Scanner revNum = new Scanner(System.in);
                int rnum, rev = 0, remainder;
                System.out.println("Enter an Integer: ");
                rnum = revNum.nextInt();
                while(rnum != 0){
                    remainder = rnum % 10;
                    rev = rev * 10 + remainder;
                    rnum /= 10;
                }
                System.out.println("Reversed Number of " + rnum + " is " + rev);
                break;
            case 12:
                System.out.print("\033[H\033[2J");
                e = 1;
                System.out.println("\nThank You For Visiting\n");
                System.exit(0);
                break;
        }
        } calc.close();
    } 
}
