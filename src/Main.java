//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n6.---------------------------\n");
        System.out.print("Enter a word to be reversed:");
        String user = input.nextLine();
        System.out.print(reverseWord(user));
    }

    public static void tip(Scanner input) {
        System.out.print("Please enter the subtotal: ");
        int subtotal = input.nextInt();
        System.out.print("Please enter the gratuity rate: ");
        int tipRate = input.nextInt();
        double tip = (double)subtotal * (double)tipRate * 0.01;
        System.out.print("Gratuity: $" + tip + "\nTotal: $" + ((double)subtotal + tip));
    }

    public static int sum(int[] numbers) {
        int total = 0;
        int[] var2 = numbers;
        int var3 = numbers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            total += num;
        }

        return total;
    }

    public static double sum(double[] numbers) {
        double total = 0.0;
        double[] var3 = numbers;
        int var4 = numbers.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            double num = var3[var5];
            total += num;
        }

        return total;
    }

    public static int findLargest(int[] nums) {
        int max = nums[0];
        int[] var2 = nums;
        int var3 = nums.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static double findLargest(double[] nums) {
        double max = nums[0];
        double[] var3 = nums;
        int var4 = nums.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            double num = var3[var5];
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int vowelsNum(String word, char[] vowels) {
        int count = 0;
        word = word.toLowerCase();

        for(int i = 0; i < word.length(); ++i) {
            char letter = word.charAt(i);
            char[] var5 = vowels;
            int var6 = vowels.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                char vowel = var5[var7];
                if (letter == vowel) {
                    ++count;
                    break;
                }
            }
        }

        return count;
    }

    public static String reverseWord(String word) {
        String newWord = "";

        for(int i = word.length() - 1; i >= 0; --i) {
            newWord = newWord + word.charAt(i);
        }

        return newWord;
    }
}
