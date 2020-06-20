package String;

/**
 * Дана строка. Вывести ее три раза через запятую и показать количество символов в ней
 */
public class Task_01 {
    public static void main(String[] args) {
        String temp = "This is a string line";
        for(int i = 1; i < 4 ; i++) {
            System.out.println(i + " line: " + temp);
        }
        System.out.printf("Length line: " + temp.length());
    }
}

/**
 * Дана строка. Вывести первый, последний и средний (если он есть)) символы.
 */
class Task_02 {
    public void stringEx(String str) {
        if(str.length() % 2 != 0) {
            int temp = str.length() / 2;
            System.out.println(str.charAt(0) + "" + str.charAt(temp) + "" + str.charAt(str.length() - 1));
        } else {
            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }
    }
    public static void main(String[] args) {
        Task_02 task = new Task_02();
        String temp1 = "Hello";
        String temp2 = "Back";
        task.stringEx(temp1);
    }
}
