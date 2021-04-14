package epamclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(),
toString(). Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

Создать массив объектов. Вывести:

a) список студентов заданного факультета;

b) списки студентов для каждого факультета и курса;

c) список студентов, родившихся после заданного года;

d) список учебной группы.
 */
public class Solution {
    static List<Student> students = new ArrayList<Student>();
    static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
    static {
        try {
            students.add(new Student(1, "Grigoriev", "Grigoriy", "Sidorovich",
                    format.parse("01.02.2000"), "21, Beyker str", "12345678912", Faculty.CS, 1, 213));
            students.add(new Student(2, "Petrov", "Sergey", "Kirillovich",
                    format.parse("02.03.1999"), "22, Tverskaya str", "112233445566", Faculty.Biology, 1, 123));
            students.add(new Student(3, "Sidorov", "Alexander", "Kirillovich",
                    format.parse("04.05.1998"), "38, Petrovka str", "987654321001", Faculty.CS, 4, 213));
            students.add(new Student(4, "Smith", "John", "Jr",
                    format.parse("06.07.1997"), "123, Savyolovskaya str", "7777777777", Faculty.Biology, 2, 213));
            students.add(new Student(5, "Obama", "Barak", "",
                    format.parse("04.08.1961"), "58, Washington str", "110000077777", Faculty.Economics, 3, 10));
            students.add(new Student(6, "Trump", "Donald", "",
                    format.parse("14.06.1946"), "1, Texas str", "1110088888888", Faculty.Economics, 2, 10));
            students.add(new Student(7, "Bush", "George", "Jr",
                    format.parse("06.07.1946"), "2, Texas str", "5559999999", Faculty.Mathematics, 5, 11));

        }catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args)
        {
            Solution app = new Solution();
            app.showStudentsByFacultySpecified(Faculty.CS);
            Helper.printMessage("***************");
            app.showStudentsByEachFaculty();
            Helper.printMessage("***************");
            app.showStudentsByEachCourse();
            Helper.printMessage("***************");
            app.showStudentsBornAfter("1992");
            Helper.printMessage("***************");
            app.showStudentsByGroupSpecified(213);
        }

    private void showStudentsByFacultySpecified(Faculty faculty) {
        for (Student student : students
        ) {
            if (student.getFaculty().equals(faculty))
                Helper.printMessage(student.toString());
        }
    }

    private void showStudentsByGroupSpecified(int group) {
        for (Student student : students
        ) {
            if (student.getGroup() == group)
                Helper.printMessage(student.toString());
        }
    }

    private void showStudentsByEachFaculty() {
        for (Faculty faculty : Faculty.values()
        ) {
            Helper.printMessage("Students of faculty " + faculty.name());
            for (Student student : students
            ) {
                if (student.getFaculty().equals(faculty))
                    Helper.printMessage(student.toString());
            }
        }
    }

    private void showStudentsByEachCourse() {
        ArrayList<Integer> courseList = new ArrayList<Integer>();
        for (Student student : students) {
            int course = student.getCourse();
            if (!courseList.contains(course))
                courseList.add(course);
        }

        for (Integer course: courseList
        ) {
            Helper.printMessage("Students of course No " + course);
            for (Student student : students
            ) {
                if (student.getCourse() == course)
                    Helper.printMessage(student.toString());
            }
        }
    }

    private void showStudentsBornAfter(String year) {
        Date date;
        try {
            date = format.parse("31.12." + year);
            for (Student student: students
            ) {
                if (student.getDateOfBirth().after(date))
                    Helper.printMessage(student.toString());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
