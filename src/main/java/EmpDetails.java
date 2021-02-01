public class EmpDetails {
    int id,sal;
    String empname;
    public EmpDetails(int id,String empname,int sal){
        this.id=id;
        this.empname=empname;
        this.sal=sal;
    }

    public void displaydata(){
        System.out.println("\n Emp id: "+id);
        System.out.println("Employee Name: "+empname);
        System.out.println("Salary: "+sal);
    }
    public static void main(String[] args){
        EmpDetails emp1=new EmpDetails(111,"Apurva",55555);
        EmpDetails emp2=new EmpDetails(222,"Mahesh",54646);
        EmpDetails emp3=new EmpDetails(333,"Ganesh",564740);
        EmpDetails emp4=new EmpDetails(444,"Nimish",55005);
        emp1.displaydata();
        emp2.displaydata();
        emp3.displaydata();
        emp4.displaydata();
    }
}
