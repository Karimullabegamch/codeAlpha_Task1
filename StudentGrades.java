import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    
    public static double calculateAverage(ArrayList<Integer> grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / (double) grades.size(); 
    }
    
  
    public static int calculateHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    public static int calculateLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int numberOfStudents;
        
    
        System.out.print("Enter the number of students: ");
        numberOfStudents = scanner.nextInt();
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade); 
        }
        
     
        double average = calculateAverage(grades);
        int highest = calculateHighest(grades);
        int lowest = calculateLowest(grades);
    
        System.out.println("\nResults:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
      
        scanner.close();
    }
    
}

// develop a program that allows a teacher to enter students grades and compute their average, higherest and lowest scores.
// you can use array and arraylist to store the student data