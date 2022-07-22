package Intro;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        getPrimeNumbers(1000);
//        isVowelOrConsonant('b');
//        isPerfectNumber(33550336);
//        isFriendlyNumber(220,284);
        isNumberInTheArray(1);
    }

    static void getPrimeNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);

            }
        }
    }

    static boolean isPrime(int number) {
        boolean prime = true;
        int i = 2;
        for (; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
//		System.out.println(prime);
        return prime;
    }

    static void isVowelOrConsonant(char character) {
        boolean isBoldVowel = false;
        switch (character) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                isBoldVowel = true;
        }
        if (isBoldVowel) {
            System.out.println(character + ": is a Bold Vowel");
        } else {
            System.out.println(character + ": is not a Bold Vowel");
        }
    }

    static boolean isPerfectNumber(int number) {
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + ": is a perfect number");
            return true;
        }
        System.out.println(number + ": is not a perfect number");
        return false;
    }

    static boolean isFriendlyNumber(int number1, int number2) {
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }
        if (total1 == number2 || total2 == number1) {
            System.out.println(number1 + " / " + number2 + ": are friendly numbers");
            return true;
        }
        System.out.println(number1 + " / " + number2 + ": are not friendly numbers");
        return false;
    }
    static boolean isNumberInTheArray(int number) {
        boolean numberInArray = false;
        Random random = new Random();
        int[] array = new int[random.nextInt(0, 100)];
        //assign element to array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        // is in array?
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                numberInArray = true;
                break;
            }
        }
        if (numberInArray) {
            System.out.println(number + ": is in the array");
        } else {
            System.out.println(number + ": is not in the array");
        }
        return numberInArray;
    }
}