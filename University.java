// University Problem
import java.util.Scanner;
public class TestUniversity {
    public static void main(String[] args) {
        University testUniversity = new University();
        testUniversity.fillUniversity();
        testUniversity.displayUniversity();
    }
}
class Student {
    int rollNo;
    String name;
    int age;
    public void setRollNo(int number) {
        rollNo = number;
    }
    public void setName(String text) {
        name = text;
    }
    public void setAge(int number) {
        age = number;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayDetails() {
        System.out.println("\nName: " + this.getName());
        System.out.println("Roll No: " + this.getRollNo());
        System.out.println("Age: " + this.getAge());
    }
}
class Batch {
    String batchName;
    int numStudents;
    Student[] stuArr;
    public void setBatchName(String text) {
        batchName = text;
    }
    public void setNumStudents(int number) {
        numStudents = number;
    }
    public String getBatchName() {
        return batchName;
    }
    public int getNumStudents() {
        return numStudents;
    }
    public void fillBatch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Batch Name: ");
        this.setBatchName(scan.nextLine());
        System.out.print("Enter number of students: ");
        this.setNumStudents(scan.nextInt());
        stuArr = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            stuArr[i] = new Student();
            System.out.println("Student " + (i+1) + ":");
            System.out.print("Enter student name: ");
            stuArr[i].setName(scan.next());
            System.out.print("Enter student roll no: ");
            stuArr[i].setRollNo(scan.nextInt());
            System.out.print("Enter student age: ");
            stuArr[i].setAge(scan.nextInt());
        }
        scan.close();
    }
    public void displayBatch() {
        System.out.println("\nBatch name: " + this.getBatchName());
        System.out.println("Total students: " + this.getNumStudents());
        for (int i = 0; i < this.getNumStudents(); i++) {
            System.out.println("Student " + (i+1) + " Details:");
            stuArr[i].displayDetails();
        }
    }
}
class Department {
    String departmentName;
    int numBatches;
    Batch[] batchArr;
    public void setDepartmentName(String text) {
        departmentName = text;
    }
    public void setNumBatches(int number) {
        numBatches = number;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public int getNumBatches() {
        return numBatches;
    }
    public void fillDepartment() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Department Name: ");
        this.setDepartmentName(scan.nextLine());
        System.out.print("Enter number of batches: ");
        this.setNumBatches(scan.nextInt());
        batchArr = new Batch[numBatches];
        for (int i = 0; i < numBatches; i++) {
            batchArr[i] = new Batch();
            System.out.println("Batch " + (i+1) + ":");
            batchArr[i].fillBatch();
        }
        scan.close();
    }
    public void displayDepartment() {
        System.out.println("\nDepartment name: " + this.getDepartmentName());
        System.out.println("Total batches: " + this.getNumBatches());
        for (int i = 0; i < this.getNumBatches(); i++) {
            System.out.println("Batch " + (i+1) + " Details:");
            batchArr[i].displayBatch();
        }
    }
}
class University {
    String universityName;
    int numDepartments;
    Department[] departArr;
    public void setUniversityName(String text) {
        universityName = text;
    }
    public void setNumDepartments(int number) {
        numDepartments = number;
    }
    public String getUniversityName() {
        return universityName;
    }
    public int getNumDepartments() {
        return numDepartments;
    }
    public void fillUniversity() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter University Name: ");
        this.setUniversityName(scan.nextLine());
        System.out.print("Enter number of departments: ");
        this.setNumDepartments(scan.nextInt());
        departArr = new Department[numDepartments];
        for (int i = 0; i < numDepartments; i++) {
            departArr[i] = new Department();
            System.out.println("Department " + (i+1) + ":");
            departArr[i].fillDepartment();
        }
        scan.close();
    }
    public void displayUniversity() {
        System.out.println("\nUniversity name: " + this.getUniversityName());
        System.out.println("Total departments: " + this.getNumDepartments());
        for (int i = 0; i < this.getNumDepartments(); i++) {
            System.out.println("Department " + (i+1) + " Details:");
            departArr[i].displayDepartment();
        }
    }
}