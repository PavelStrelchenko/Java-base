package com.aston.javabase;

public class Homework {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        String reString = "";
        for (int i = string.length() - 1; i > -1; i-- ){
            reString += string.charAt(i);
        }
        System.out.println(reString);
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length - 2; i++ ){
            if (ints[i] == ints[i + 1]){
                ints[i] = 0;
                count++;
            }
        }
        int [] noDoubles = new int[ints.length - count];
        int j = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints [i] != 0){
                noDoubles[j] = ints[i];
                j++;
            }
        }
        for (int i = 0; i < noDoubles.length; i++){
            System.out.println(noDoubles[i]);
        }
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        Arrays.sort(arr);
        Integer i = arr[arr.length - 2];
        return i;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        String [] result = string.split("\s+");
        String subStr = result[result.length - 1];
        Integer longStr = subStr.length();
        return longStr;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        boolean poLin = false;
        int part = string.length()/2;
        int strEnd = string.length() - 1;
        for (int i = 0; i <= part - 1; i++){
            if(string.charAt(i) == string.charAt(strEnd)){
                if( i== part - 1){
                    poLin = true;
                    break;
                } else {
                    strEnd -= 1;
                    continue;
                }
            }
        }
        return poLin;
    }
}
