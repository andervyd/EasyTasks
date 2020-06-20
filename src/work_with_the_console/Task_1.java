/**
 * Работа с консолью
 * http://www.itmathrepetitor.ru/prog/zadachi-na-vychisleniya/
 */

package work_with_the_console;

import java.text.SimpleDateFormat;
import java.util.Date;

class OutWord {
    /**
    * Вывести на экран текст "Silence is golden".
    */
    public String outWord(String str) {
        return str;
    }
}

class OutDate {
    /**
    * Вывести на экран текущее название дня недели, название месяца
    * и свое имя. Каждое слово должно быть в отдельной строке.
    */
    public String dateAndName(String name) {
        SimpleDateFormat date = new SimpleDateFormat("День недели: EEEE "+"\n"+"Текущий месяц: MMMM");
        String str = date.format(new Date()) +"\n"+"Имя пользователя: "+name;
        return str;
    }
}

class OutZero {
    /**
    * Вывести на экран пять строк из нулей,
    * причем количество нулей в каждой строке равно номеру строки.
    */
    public void zeroZero() {
        int count;
        do {
            for(count = 0; count <= 5; count++) {
                System.out.print(count + ":");
                for(int j = 0; j < count; j++) {
                    System.out.print(" 0");
                }
                System.out.println();
            }
        } while (count == 5);
    }
}

class OutputData {
    public static void main(String[] args) {
// Task 1
        OutWord outWord = new OutWord();
        System.out.println("Task 1:");
        System.out.println(outWord.outWord("Silence is golden") + "\n");
// Task 2
        OutDate outDate = new OutDate();
        System.out.println("Task 2:");
        System.out.println(outDate.dateAndName("Alexey") + "\n");
// Task 3
        OutZero outZero = new OutZero();
        System.out.println("Task 3:");
        outZero.zeroZero();
    }
}

