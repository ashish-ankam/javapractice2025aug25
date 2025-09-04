package manytoonemapping;
//import manytoonemapping.Branch;

//Target Object
public class Student {

    String studentName;
    String studentId;
    Branch branch; // Association with Branch class

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Branch getBranch() {
        return branch;
    }

}
