package studentapplication; 

  

import java.util.Arrays; 

import java.util.Scanner; 

class StudentApplication implements StudentOperations { 

    @Override 

    public void takeAdmission(Student student) { 

// if (student.getAge() > 6) { 

     

            System.out.println("Admission taken for student: " + student.getName()); 

  

            // Add the new student to the students array 

            int currentLength = students.length; 

            Student[] newStudents = Arrays.copyOf(students, currentLength + 1); 

            newStudents[currentLength] = student; 

            students = newStudents; 

  

    } 

  

    @Override 

    public Student takeAdmissionFromConsole() { 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter details of new student:"); 

  

        System.out.print("Roll: "); 

        int roll = scanner.nextInt(); 

        scanner.nextLine(); // Consume the newline character 

  

        System.out.print("Name: "); 

        String name = scanner.nextLine(); 

  

        System.out.print("Address: "); 

        String address = scanner.nextLine(); 

  

        System.out.print("DOB: "); 

        String dob = scanner.nextLine(); 

  

        int numSubjects = 3; 

        String[] subjects = new String[numSubjects]; 

        subjects[0] = "Language"; 

        subjects[1] = "Maths"; 

        subjects[2] = "Science"; 

        double[] marks = new double[numSubjects]; 

        double[] maxMarks = new double[numSubjects]; 

  

        for (int i = 0; i < numSubjects; i++) { 

  

            System.out.print("Marks obtained in Subject " + subjects[i] + ": "); 

            marks[i] = scanner.nextDouble(); 

            scanner.nextLine(); // Consume the newline character 

  

            System.out.print("Maximum marks in Subject " + subjects[i] + ": "); 

            maxMarks[i] = scanner.nextDouble(); 

            scanner.nextLine(); // Consume the newline character 

        } 

  

        Student newStudent = new Student(roll, name, address, dob, subjects, marks, maxMarks); 

        return newStudent; 

    } 

    public double calculateGrade(Student student) { 

        // Grade calculation logic 

        double totalMarks = student.getSubjectMarks()[0] + student.getSubjectMarks()[1] + student.getSubjectMarks()[2]; 

        return totalMarks / 3.0; 

    } 

    public void displayMarks(Student student) { 

        // Display marks obtained by the student 

        System.out.println("Marks obtained by " + student.getName() + ":"); 

        for (int i = 0; i < student.getSubjectMarks().length; i++) { 

            System.out.println(student.getSubjectNames()[i] + ": " + student.getSubjectMarks()[i]); 

        } 

    } 

// @Override 

    public void displaySubjectWiseMarks(Student student) { 

        // Display subject-wise marks and highest marks recorded in each subject 

        System.out.println("Subject-wise marks for " + student.getName() + ":"); 

        for (int i = 0; i < student.getSubjectMarks().length; i++) { 

            System.out.println(student.getSubjectNames()[i] + ": " + student.getSubjectMarks()[i]); 

        } 

        System.out.println("Highest marks recorded in each subject:"); 

        for (int i = 0; i < student.getSubjectNames().length; i++) { 

            System.out.println(student.getSubjectNames()[i] + ": " + student.getHighestMarks()[i]); 

        } 

    } 

    public void displayDataInTabularForm(Student[] students) { 

        // Display student data in tabular form 

// System.out.println("Student Data:"); 

        System.out.println("Roll\tName\tAddress\tDOB\tLanguage\tMaths\tScience"); 

        for (Student student : students) { 

            System.out.print(student.getRoll() + "\t" + student.getName() + "\t" + student.getAddress() + "\t" + 

                    student.getDOB() + "\t"); 

            for (double marks : student.getSubjectMarks()) { 

                System.out.print(marks + "\t"); 

            } 

            System.out.println(); 

        } 

    } 

  

    private static Student[] students; // Global variable declaration 

  

public Student[] getStudents() { 

// TODO Auto-generated method stub 

return null; 

} 

  

} 

  