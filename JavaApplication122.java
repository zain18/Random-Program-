
package javaapplication122;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections; 

public class JavaApplication122 {

    
    public static void main(String[] args) {
        boolean userin;
         Scanner input = new Scanner(System.in);
        do
        {
          
            System.out.println(" Please input a non negative number");
            int userinput = input.nextInt();
            if(userinput < 0){
                System.out.println(" You entered a negative number try again");
                userinput = input.nextInt();
            }
            System.out.println(sortDesc(userinput));
            System.out.println(" Try again ?");
            userin = input.nextBoolean();
            
        }while(userin);
       System.out.println("Enter a String to spin it");
       String userStr = input.nextLine();
       System.out.print(spinWords(userStr));
       System.out.println("Finding Duplcates of a word");
       System.out.println("Please enter a word");
       String userStr2 = input.nextLine();
       System.out.println(getDuplicates(userStr2));
       System.out.println("Enter a String to encode it");
       String userStr3 = input.nextLine();
       System.out.println(encode(userStr3));
       
       System.out.println("Now let's do some addition");
       System.out.println("Up to How many numbers u wanna add starting from the first number?");
         int n1 = input.nextInt();
         System.out.println(seriesSum(n1));
         System.out.println(" finding the maximun number of breaks we can have ");
        boolean cont;
        do
        {
        System.out.println(" Enter n: ");
        int n12 = input.nextInt();
        System.out.println(" Enter m: ");
        int m1 = input.nextInt();
        System.out.println(" Number of breaks needed is : \n");
        System.out.println(breakChocolate(n12, m1));
        System.out.println(" try again?: ");
        cont = input.nextBoolean();
        if(cont == false)
            break;
        }while(cont = true);

         
    }
    public static int sortDesc(int num) 
   {
       Scanner input = new Scanner(System.in);
       int number = num;
       int temp;
       int length = String.valueOf(number).length();
       int [] arr = new int[length];
       int digit;
       int l = 0;
       while(number > 0 && l < length)
       {
            
            digit = number % 10;
            number /= 10;
            arr[l] = digit;
            l++;
       }
        for (int j = 0; j < length; j++) 
        {
            for (int k = j + 1; k < length; k++) 
            {
                if (arr[j] < arr[k]) 
                {
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        
        
        StringBuilder sb = new StringBuilder(arr.length);
        
        for (int dig : arr) 
        {
           sb.append(dig);
        }
        
       int numba = Integer.parseInt(sb.toString());
       return numba;
  
   }
    public static String spinWords(String sentence)
    {
       String s1= sentence;
       String S3 = " ";
       String S2 = " ";
       String Input1;
       String[] splitStr = s1.split("\\s+");
       int arrsize = splitStr.length;
       for(int i =0; i < arrsize ; i++)
       {
           if(splitStr[i].length() < 5)
           {
               String input = splitStr[i]; 
  
                StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
                input1.append(input); 
                 
                Input1 = input1.toString();
                s1 = Input1;
                return Input1;
           }
           else if(splitStr[i].length() >= 5)
           {
                String input = splitStr[i]; 
  
                StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
                input1.append(input); 
  
        // reverse StringBuilder input1 
                input1 = input1.reverse(); 
  
        // print reversed String 
              
              String converted = input1.toString();
                return converted;
                
           }
           StringBuilder input2 = new StringBuilder();
           input2.append(S2).append(S3);
           String input3;
           input3 = input2.toString();
           
           
       }
    return s1;    
    }
    
    static String encode(String S)
    {
        
        String dup = getDuplicates(S);
        StringBuilder input1 = new StringBuilder(); 
        for(int i = 0; i<S.length(); i++)
        {
            for(int j = 0; j<dup.length(); j++)
            {
                if(S.charAt(i) == dup.charAt(j)){
                    input1.append(')');
                }
               
            else if((S.charAt(i) != dup.charAt(j)))
            {
                input1.append('(');
            }
            else if(dup.equals(""))
            {
                for(int k = 0; k < S.length(); k++)
                {
                    input1.append('(');
                }
                    
            }
            }
            
        }
        
         return input1.toString();
    }
public static String getDuplicates(String S) {
    int count = 0;
    String t = " ";
    for (int i = 0; i < S.length() - 1; i++) {
        for (int j = i + 1; j < S.length(); j++) {
            if (S.charAt(i) == S.charAt(j) && !t.contains(S.charAt(j) + "")) {
                t = t + S.charAt(i);
            }
            else 
                t = t;
        }
    }
    
   return t;
}
public static String seriesSum(int n) {
        double  sum = 0.0;
        String strI = "";
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers u want in your array?");
        int userint1 = input.nextInt();
        double [] arr = new double [userint1];
        System.out.println(" please enter" + userint1 + "numbers");
        
        for(int i = 0; i< arr.length; i++)
        {
           
           arr[i] = Fraction();
           
        } 
        System.out.println(Arrays.toString(arr));
        
        for( int i = 0; i< n; i++) {
             sum += arr[i];
        }
            System.out.println(sum);
            double roundOff = (double) Math.round(sum * 100) / 100;
            strI = String.valueOf(roundOff);
            return strI;  
                
        }
         
        
	
    public static double Fraction()
    {
        
        Scanner input = new Scanner(System.in);
        double fraction = 0.0;
        
        System.out.println(" please enter the numerator");
        double num = input.nextDouble();
        System.out.println(" please enter the numerator");
        double den = input.nextDouble();
        fraction = num/den;
         
        System.out.println(fraction);
        
        return fraction;
    }

   public static int breakChocolate(int n, int m)
    {
        int breaks =0;
        int numbOfSquares;
        if(n == 1 && m ==1)
        {
            System.out.println(" no breaks needed");
            return 0;
        }
        else if(n == 0 || m ==0 || n < 0 || m< 0)
        {
            System.out.println(" invalid input");
            return 0;
        }
        else
        {
            numbOfSquares = n * m;
            breaks = numbOfSquares - 1;
        }
        
       return breaks;
    }

}
