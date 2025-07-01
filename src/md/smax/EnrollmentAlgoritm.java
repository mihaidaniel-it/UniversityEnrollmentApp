package md.smax;
// Импортирует библиотеку
import java.util.Scanner;

public class EnrollmentAlgoritm {
    public static void main(String[] args) {
//        Создаем объект
        Scanner scanner = new Scanner(System.in);

//        Объявление данных
        System.out.print("Введите ваше имя: ");
        String studentName = scanner.nextLine();
        System.out.println("Здраствуйте, " + studentName);

        System.out.print("Ваш балл за экзамен по математике (0-100): ");
        double mathNote = scanner.nextInt();
        System.out.print("Ваш балл за экзамен по английскому языку(0-100): ");
        double englishNote = scanner.nextInt();
        System.out.print("Ваш балл за экзамен по русскому языку (0-100): ");
        double russianNote = scanner.nextInt();
        System.out.print("Ваш балл за экзамен по химии (0-100): ");
        double chemistryNote = scanner.nextInt();

//        Подсчет оценок
        double scoreToGradePointRotation = 0.05;
        double mathGrade = mathNote * scoreToGradePointRotation;
        double englishGrade = englishNote * scoreToGradePointRotation;
        double russianGrade = russianNote * scoreToGradePointRotation;
        double chemistryGrade = chemistryNote * scoreToGradePointRotation;
        System.out.println("Ваша оценка за экзмен по математике: " + mathGrade);
        System.out.println("Ваша оценка за экзмен по английскому языку: " + englishGrade);
        System.out.println("Ваша оценка за экзмен по русскому языку: " + russianGrade);
        System.out.println("Ваша оценка за экзмен по химии: " + chemistryGrade);

        double gpa = (mathGrade + englishGrade + russianGrade + chemistryGrade) / 4;
        System.out.println("Ваш средний балл: " + gpa);

        int minGpa = 3;
        boolean hasPassedMinGpa = gpa >= minGpa;
        String studentMessage = hasPassedMinGpa
                ? "Вы набрали больше проходного балла"
                : "Вы набрали меньше проходного балла";
        System.out.println(studentName + ", " + studentMessage);

//        Определение факультета
        if (hasPassedMinGpa) {
            if (gpa > 4) {
                System.out.println("Вы прошли на факультет Матиматики и Информатики");
            } else if (gpa > 3.8) {
                System.out.println("Вы прошли на факультет Химии и Биологии");
            } else if (gpa > 3.5) {
                System.out.println("Вы прошли на факультет Пра-во");
            } else {
                System.out.println("Вы прошли на факультет Философии");
            }
        } else {
            System.out.println("К сожалению, мы не можем вас зачислить в наш университет");
        }
    }
}
