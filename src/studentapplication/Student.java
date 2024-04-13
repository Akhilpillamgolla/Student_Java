package studentapplication; 

class Student { 

private int roll; 

private String name; 

private String address; 

private String dob; 

private String[] subjectNames; 

private double[] subjectMarks; 

private double[] highestMarks; 

 
 

public Student(int roll, String name, String address, String dob, String[] subjectNames, double[] subjectMarks, double[] highestMarks) { 

this.roll = roll; 

this.name = name; 

this.address = address; 

this.dob = dob; 

this.subjectNames = subjectNames; 

this.subjectMarks = subjectMarks; 

this.highestMarks = highestMarks; 

} 

 
 

public int getRoll() { 

return roll; 

} 

 
 

public String getName() { 

return name; 

} 

 
 

public String getAddress() { 

return address; 

} 

 
 

public String getDOB() { 

return dob; 

} 

 
 

public String[] getSubjectNames() { 

return subjectNames; 

} 

 
 

public double[] getSubjectMarks() { 

return subjectMarks; 

} 

 
 

public double[] getHighestMarks() { 

return highestMarks; 

} 

 
 

public int getAge() { 

// Calculate age based on DOB 

// You can implement the logic to calculate age here 

return 0; 

} 

} 