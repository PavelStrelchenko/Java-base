public class Main {
    public static void main(String[] args) {
        Homework task = new Homework();

//        ������ 1
        String string = "I love Java";
        task.turnString(string);

//        ������ 2
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        task.getDistinctNumbers(ints);

//        ������ 3
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        Integer in = task.findSecondMaxElement(arr);
        System.out.println(in);

//        ������ 4
        String str = "    fly me    to the moon    ";
        Integer result = task.lengthOfLastWord(str);
        System.out.println(result);

//        ������ 5
        String str = "112233";
        boolean pol = task.isPalindrome(str);
        System.out.println(pol);

    }
}