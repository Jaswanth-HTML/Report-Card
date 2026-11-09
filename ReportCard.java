import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter maximum marks:- ");
        int a = scanner.nextInt();
        scanner.nextLine();
        
        final int MAX_SUBJECTS = a;
        String[] subjects = new String[MAX_SUBJECTS];
        int[] marks = new int[MAX_SUBJECTS];
        int count = 0;

        System.out.print("Enter Student Name:- ");
        String studentName = scanner.nextLine();

        System.out.println("\n--- Enter Subjects and Marks (Type 'done' for subject name to finish) ---");

        while (count < MAX_SUBJECTS) {
            System.out.print("\nEnter Subject Name (or 'done'): ");
            String subject = scanner.nextLine().trim();

            if (subject.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Mark for " + subject + ": ");
            int mark = scanner.nextInt();
            scanner.nextLine();

            subjects[count] = subject;
            marks[count] = mark;
            count++;
        }

        int total = 0;
        for (int i = 0; i < count; i++) {
            total += marks[i];
        }

        double average = count == 0 ? 0.0 : (double) total / count;

        System.out.println("\n------------------------------------------------------------");
        System.out.println("                        REPORT CARD                         ");
        System.out.println("NAME: " + studentName);
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s %10s%n", "SUBJECT", "MARK");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s %10d%n", subjects[i], marks[i]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL: %-10d AVERAGE: %.2f%n", total, average);
        System.out.println("------------------------------------------------------------");

        scanner.close();
    }
}