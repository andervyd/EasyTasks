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

//        1 line: This is a string line
//        2 line: This is a string line
//        3 line: This is a string line
//        Length line: 21
    }
}

/**
 * Дана строка. Вывести первый, последний и средний (если он есть)) символы.
 */
class Task_02 {

    private String evenLine = "This is string line (even)";
    private String oddLine = "This is string line (odd)";

    public String getEvenLine() {
        return evenLine;
    }
    public void setEvenLine(String evenLine) {
        this.evenLine = evenLine;
    }

    public String getOddLine() {
        return oddLine;
    }
    public void setOddLine(String oddLine) {
        this.oddLine = oddLine;
    }

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

        task.stringEx(task.getEvenLine());
        task.stringEx(task.getOddLine());

//        T)
//        Tn)
    }
}

/**
 * Дана строка. Вывести первые три символа и последний три символа, если длина строки больше 5.
 * Иначе вывести первый символ столько раз, какова длина строки.
 */
class Task_03 {
    private String evenLine = "back";
    private String oddLine = "round";

    public String getEvenLine() {
        return evenLine;
    }
    public void setEvenLine(String evenLine) {
        this.evenLine = evenLine;
    }

    public String getOddLine() {
        return oddLine;
    }
    public void setOddLine(String oddLine) {
        this.oddLine = oddLine;
    }

    public void stringEx(String str) {
        if(str.length() < 5) {
            System.out.println(str.substring(0, 3) + " " + str.substring(str.length() - 3, str.length()));
        } else {
            System.out.println(str.charAt(0) + ", length line: " + str.length());
        }
    }

    public static void main(String[] args) {
        Task_03 task = new Task_03();

        task.stringEx(task.getEvenLine());
        task.stringEx(task.getOddLine());

//        bac ack
//        r, length line: 5
    }
}









