package com.bridgelabz;

public class HashMapMain {
    public static void main(String[] args) {

        String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = string.toLowerCase().split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }
        System.out.println(hashMap);
    }
}