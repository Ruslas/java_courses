package strings.regex.employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Report {
    public static void generateReport(Employee... employees) {
        for (Employee employee : employees) {
            System.out.printf("Emploee %-15s - %,.2f%n",
                    employee.getFullName(), employee.getSalary());
        }
    }

    public static void generateReportFile(String fileName, Employee... employees) {
        StringBuilder pass = new StringBuilder(
                "src\\strings\\regex\\employee\\").append(fileName).append(".txt");
        for (Employee employee : employees) {
            try (BufferedWriter bufferWriter =
                         new BufferedWriter(new FileWriter(
                                 pass.toString(), true))) {
                bufferWriter.write(new Formatter().format("Emploee %-15s - %,.2f%n",
                        employee.getFullName(), employee.getSalary()).toString());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
