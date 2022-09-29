public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Task2
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCaseFullName);

        //Task3
        fullName = "Иванов Семён Семёнович";
        String eReplacedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + eReplacedFullName);

    }
}