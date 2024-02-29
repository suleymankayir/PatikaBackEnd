public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Kemal",2000.0,45,1985);
        emp1.calculateTax();
        emp1.calculateBonus();
        emp1.raiseSalary();
        emp1.toString();
    }
}