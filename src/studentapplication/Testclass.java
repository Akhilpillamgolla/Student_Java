package studentapplication; 

 
 

import java.util.Scanner; 

 
 

public class Testclass { 

public static void main(String[] args) { 

Student[] students = new Student[2]; // Initialize the students array 

 
 

// Create student objects and assign them to the students array 

students[0] = new Student(1, "John", "123 Main St", "2005-01-01", 

new String[] { "Language", "Maths", "Science" }, new double[] { 80.0, 90.0, 85.0 }, 

new double[] { 100.0, 95.0, 90.0 }); 

 
 

students[1] = new Student(2, "Jane", "456 Elm St", "2006-02-02", 

new String[] { "Language", "Maths", "Science" }, new double[] { 75.0, 85.0, 95.0 }, 

new double[] { 100.0, 90.0, 95.0 }); 

 
 

StudentApplication studentApp = new StudentApplication(); 

 
 

Scanner scanner = new Scanner(System.in); 

System.out.println( 

"choose one operation ( 1.Admission ,2.CalculateGrade ,3.DisplayMarks ,4.DisplaySubjectWiseMarks ,5.DisplayDataInTabularForm ):"); 

int number = scanner.nextInt(); 

if (number == 1) { 

System.out.println("please enter age of student:"); 

int age = scanner.nextInt(); 

if (age > 6) { 

Student newstudent = studentApp.takeAdmissionFromConsole(); 

studentApp.takeAdmission(newstudent); 

} else { 

System.out.println("Admission not allowed for student: "); 

} 

System.out.println("Current Student data : "); 

studentApp.displayDataInTabularForm(students); 

} else if (number == 2) { 

double grade1 = studentApp.calculateGrade(students[0]); 

double grade2 = studentApp.calculateGrade(students[1]); 

System.out.println("Grade for " + students[0].getName() + ": " + grade1); 

System.out.println("Grade for " + students[1].getName() + ": " + grade2); 

} else if (number == 3) { 

studentApp.displayMarks(students[0]); 

studentApp.displayMarks(students[1]); 

} else if (number == 4) { 

studentApp.displaySubjectWiseMarks(students[0]); 

studentApp.displaySubjectWiseMarks(students[1]); 

} else if (number == 5) { 

studentApp.displayDataInTabularForm(students); 

} else { 

System.out.println("Please select a number from 1 - 5 : "); 

} 

 
 

Student[] currentStudents = studentApp.getStudents(); 

System.out.println("Current Student data : "); 

studentApp.displayDataInTabularForm(currentStudents); 

 
 

} 

 
 

} 