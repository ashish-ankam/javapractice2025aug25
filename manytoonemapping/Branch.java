package manytoonemapping;

//Dependent Object
// Branch class does not contain Student class reference
// i.e Many Students can be associated with one Branch
//association using setter and getter method
public class Branch {


    String branchName;
    String branchCode;
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getBranchName() {
        return branchName;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    public String getBranchCode() {
        return branchCode;
    }   
}
