public class TestEnployee {
    public static void main(String[] args){
        Employee employee = new Employee("sanjeewa", 23, 10000.00, 2000);



        System.out.println("Name: "+employee.getName());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Bonus: "+employee.getBonus());
        System.out.println("Bonus Amount: "+employee.bonusAmount());
    }
}
