import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.---------------------------\n");
      tip(input);

        System.out.print("\n2.---------------------------\n");
        int[] numArr = new int[5];
      System.out.print("Enter 5 integers:\n");
      for(int i=0; i<5; i++){
         numArr[i]=input.nextInt();
      }
      System.out.print(sum(numArr));

        System.out.print("\n3.---------------------------\n");
        System.out.print("Enter five rational numbers 5 rational numbers:");
        double[] doubleArr = new double[5];
        for(int i=0; i<5; i++){
            doubleArr[i]=input.nextDouble();
        }
        System.out.print(sum(doubleArr));
        input.nextLine();

        System.out.print("\n4.---------------------------\n");
        int[] arrNums ={23,25,200,62,6103,22,61,72,9,100};
        double[] doubleNums = {1.3, 2.5, 9.2,22.55,82.2,9.09,1.2,6.4,7.7,0.99};
        System.out.print("\nThe largest number in the first array is:");
        System.out.print(findLargest(arrNums));
        System.out.print("\nThe largest number in the second array is:");
        System.out.print(findLargest(doubleNums));

        System.out.print("\n5.---------------------------\n");
        char[] vowels = {'a','e','i','o','u'};
        String userWord = input.nextLine();
        int vowelCount = vowelsNum(userWord, vowels);
        System.out.print("The number of vowels in "+ userWord+ " is: "+vowelCount);
        input.nextLine();

        System.out.print("\n6.---------------------------\n");
        System.out.print("Enter a word to be reversed:");
        String user = input.nextLine();
        System.out.print(reverseWord(user));
    }
    //Question 1 Gratuity;
    public static void tip(Scanner input){
        System.out.print("Please enter the subtotal: ");
        int subtotal = input.nextInt();

        System.out.print("Please enter the gratuity rate: ");
        int tipRate = input.nextInt();

        double tip = subtotal *(tipRate*0.01);

        System.out.print("Gratuity: $"+tip+"\n"+"Total: $"+(subtotal + tip));
    }

    //    Question 2
    public static int sum(int[] numbers){
        int total=0;
        for(int num: numbers){
            total+=num;
        }
        return total;
    }
    //      Question 3
    public static double sum(double[] numbers){
        double total=0;
        for(double num: numbers){
            total+=num;
        }
        return total;
    }
    //  Question 4
    public static int findLargest(int[] nums){
        int max = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static double findLargest(double[] nums){
        double max = nums[0];
        for(double num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }


    //    Question 5
    public static int vowelsNum(String word, char[] vowels){
        int count = 0;

        word = word.toLowerCase();
        for(int i = 0; i<word.length();i++){
            char letter = word.charAt(i);

            for(char vowel: vowels){
                if(letter == vowel){
                    count++;
                    break;
                }

            }
        }
        return count;
    }
    //    Question 6
    public static String reverseWord(String word){
        String newWord = "" ;
        for(int i=word.length()-1; i>=0; i--){
            newWord += word.charAt(i);
        }
        return newWord;
    }
}
