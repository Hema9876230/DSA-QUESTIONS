import java.util.*;
public class basic {
    //Conditional Thinking (IF-ELSE , Boolena Logic )
    //--------------LEVEL 1 ---------------------------
    //---------SIMPLE CONDITIONS ---------------------------
    // Que 1 :- Take a number and print whether its positive negative or Zero 
    public static void main (String[] args)
   /*  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0)
        {
            System.out.println("Zero");
        }
        if(num>0)
        {
          System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
    */
/*{
    //----------------------------------Question -------------------2-------------------------------
    //Check number is even or odd
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%2==0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }

}
*/

//----------------------------------Question 3--------------------------------------------------
//Check if a number is divisiblle by 5------------
/*{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%5==0)
    {
        System.out.println("divisible by 5");
    }
    else
    {
        System.out.println("not divisiblle by 5");
    }

}
*/
/*{
    //Que 4:- Check is a number is divisible by both 3 and 5.............................
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%5==0 && num%3 ==0)
    {
        System.out.println("divisible by 5 and 3 both");
    }
    else
    {
        System.out.println("not divisible by 5 and 3 both");
    }


}
    */
   /*{
    // Question:- 5 Check if a given year is a leap year ------------------------------
    
    Scanner sc = new Scanner(System.in);
    int Year = sc.nextInt();
    if(Year%4==0)
    {
        System.out.println("Leap year");
    }
    else
    {
        System.out.println("Not a leap year");
    }


   }
    */

   /*{
    //Question 6 :- print largest number -------------------------------
     Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b)
    {
        System.out.println("a is largest number");
    }
    else 
    {
        System.out.print("b is largest number");
    }
   }
    */
   //{
    // Question 7 :- Take 3 number and print the largest one 
    /* Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
     int b = sc.nextInt();
      int c = sc.nextInt();
      if(a>b && a>c)
      {
        System.out.print("a is largest number");
      }
      if(b>a && b>c)
      {
        System.out.print ("b is largest");
      }
      else
      {
        System.out.print("c is largest");
      }
   }
      */
   // LEVEL 2 :Nested IF AND MULLTIPLE CONDITIONS
   // Question 1:- Take three sides of triangle  and check if they form a valid triangle or not 
   /*{
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if(a+b>c && b+c>a && c+a>b)
     {
        System.out.println("Valid triangle");
     }
     else
     {
        System.out.println("Not a valid triangle");
     }
   }
     */
    //Question :- 2 TAKE THREE NUMBER AND CHECK IF THEY CAN FORM A PYTHAGOREAM TRIPLET 
   /*  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        if(max == a)
        {
            if(a*a==b*b+c*c)
            {
                System.out.println("Pythagorean triplet");
            }
            else
            {
                System.out.println("Not a Pythagoream triplet");
            }
        }
        if(max == b)
        {
            if(b*b == a*a + c*c)
            {
                System.out.println("Pythagorean Triplet");
            }
            else
            {
                System.out.println("Not a pythagorean triplet");
            }
        }
        if(max == c)
        {
            if(c*c == a*a + b*b)
            {
                System.out.println("Pythagoream Triplet");
            }
            else
            {
                System.out.println("Not a pythagorean Triplet");
            }
        }
    }
        */
    //Question 3 :- Check if one of the two given number is multiple of other
    /*{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       if(a%b==0 || b%a==0)
       {
        System.out.print("Multiple of other number");
       }
      else
      {
        System.out.print("Not mulltiple of other");
      }

    }
      */
     //Question 4:- 
}   

