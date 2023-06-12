public class Main {
    public static void main(String[] args) {
        // Создаем массив типа String с размером 7
        String[] daysOfWeek = new String[7];

        // Заполняем массив значениями дней недели
        daysOfWeek[0] = "Понедельник";
        daysOfWeek[1] = "Вторник";
        daysOfWeek[2] = "Среда";
        daysOfWeek[3] = "Четверг";
        daysOfWeek[4] = "Пятница";
        daysOfWeek[5] = "Суббота";
        daysOfWeek[6] = "Воскресенье";

        // Выводим значение последнего элемента на консоль
        System.out.println(daysOfWeek[daysOfWeek.length - 1]);
    }
}

