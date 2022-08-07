public class Main {
    public static void main(String[] args) {
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + replaceFullName);
    }
}