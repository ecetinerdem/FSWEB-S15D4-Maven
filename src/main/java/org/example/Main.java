package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-z0-9]" , "").toLowerCase();
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        for (char c: cleanText.toCharArray()) {
            characterLinkedList.add(c);
        }
        while (characterLinkedList.size() > 1) {
            if(!characterLinkedList.pollFirst().equals(characterLinkedList.pollLast())) {
                return  false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary (int decimal) {
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2;
        }
        StringBuilder binaryString = new StringBuilder();
        for (int digit: binaryList) {
            binaryString.append(digit);
        }
        return binaryString.toString();
    }
}