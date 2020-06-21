/**
 * ЗАДАЧИ НА КЛАССЫ
 * http://www.itmathrepetitor.ru/zadachi-na-klassy/
 */

package Class;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Iterator;
=======
import java.util.List;
>>>>>>> 19a34d6247616ac15443b95e9c87cb749b219e4f

/**
     Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
     Создать массив из десяти элементов такого типа, упорядочить записи по возрастанию среднего балла.
     Добавить возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.
 */
class Student {

    private String firstName;
    private String lastName;
    private int idGroup;

    private int averageRating;
    private int mathematics;
    private int geometry;
    private int computer;
    private int psychology;
    private int chemistry;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdGroup() {
        return idGroup;
    }
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getAverageRating() {
        return averageRating;
    }
    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public int getMathematics() {
        return mathematics;
    }
    public void setMathematics(int mathematics) {
        if(mathematics > 5)
        this.mathematics = mathematics;
    }

    public int getGeometry() {
        return geometry;
    }
    public void setGeometry(int geometry) {
        if(geometry > 5)
        this.geometry = geometry;
    }

    public int getComputer() {
        return computer;
    }
    public void setComputer(int computer) {
        if(computer > 5)
        this.computer = computer;
    }

    public int getPsychology() {
        return psychology;
    }
    public void setPsychology(int psychology) {
        if(psychology > 5)
        this.psychology = psychology;
    }
    public int getChemistry() {
        return chemistry;
    }
    public void setChemistry(int chemistry) {
        if(chemistry > 5)
        this.chemistry = chemistry;
    }

<<<<<<< HEAD
    public Student(String firstName, String lastName, int idGroup) {
=======
    public Student(String firstName, String lastName, int idGroup, int averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idGroup = idGroup;
        this.averageRating = averageRating;
>>>>>>> 19a34d6247616ac15443b95e9c87cb749b219e4f

    }

    public int progress(int mathematics, int geometry, int computer, int psychology, int chemistry) { // five point system
        int[] rating = new int[5];
        if(mathematics > 5 || geometry > 5 || computer > 5 || psychology > 5) {
            System.out.println("Score no more than five points");
        } else {
            rating[0] = mathematics;
            rating[1] = geometry;
            rating[2] = computer;
            rating[3] = psychology;
            rating[3] = chemistry;
        }
        int averageRating = 0;
        for(int i = 0; i < rating.length; i++) {
            averageRating += rating[i];
        }
        averageRating /= rating.length;
        return averageRating;
    }

<<<<<<< HEAD
    public void test(String firstName, int idGroup) {
=======
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", idGroup=" + this.idGroup +
                ", averageRating=" + this.averageRating +
                '}';
>>>>>>> 19a34d6247616ac15443b95e9c87cb749b219e4f
    }
}

class OutData_01 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Student st1 = new Student("Ivan", "Tara", 5307);
        Student st2 = new Student("Ivan", "Tara", 2362);
        Student st3 = new Student("Ivan", "Tara", 1377);
        Student st4 = new Student("Ivan", "Tara", 1407);
        ArrayList<Student> list = new ArrayList<>();
=======
        Student st1 = new Student("Ivan", "Tara", 5307, 3);
        Student st2 = new Student("Ivan", "Tara", 2362, 5);
        Student st3 = new Student("Ivan", "Tara", 1377, 4);
        Student st4 = new Student("Ivan", "Tara", 1407, 3);
        List<Student> list = new ArrayList<>();
>>>>>>> 19a34d6247616ac15443b95e9c87cb749b219e4f
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
<<<<<<< HEAD
        System.out.println(list.size());
=======
        Student st5 = list.get(0);
        System.out.println(String.valueOf(st1));
        System.out.println(String.valueOf(st5));
>>>>>>> 19a34d6247616ac15443b95e9c87cb749b219e4f
    }
}