package manytoonemapping;
//One to Many Mapping Example code . where Branch i.e Dependent object is Injecting to Student i.e a Target Object
//Main Class    

public class ManyToOneMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Alice");
        student1.setStudentId("S001");

        Branch branch1 = new Branch();
        branch1.setBranchName("Computer Science");
        branch1.setBranchCode("CS101");

        student1.setBranch(branch1);

       

        Student student2 = new Student();
        student2.setStudentName("Bob");                        
        student2.setStudentId("S002");
        student2.setBranch(branch1); // Same branch as student1

        Student s[] = {student1, student2};

        for (Student student : s) {
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Branch Name: " + student.getBranch().getBranchName());
            System.out.println("Branch Code: " + student.getBranch().getBranchCode());
        }
    }
}
