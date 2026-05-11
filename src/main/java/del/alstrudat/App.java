package del.alstrudat;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String nim = scanner.nextLine();
            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());
            students[i] = new Student(nim, name, score);
        }

        students = Program.mergeSort(students);

        for (Student s : students) {
            System.out.println(s);
        }

        scanner.close();
    }
}