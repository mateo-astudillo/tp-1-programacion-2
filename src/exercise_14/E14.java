package exercise_14;

public class E14 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(123423964, 'A');
        employees[1] = new Employee(531273547, 'C');
        employees[2] = new Employee(968934628, 'B');
        employees[3] = new Employee(456236623, 'B');
        employees[4] = new Employee(190068384, 'D');
        employees[0].setSurname("Pérez");
        employees[1].setSurname("Valdez");
        employees[2].setSurname("Castillo");
        employees[3].setSurname("Gómez");
        employees[4].setSurname("Araujo");

        System.out.println("DNI\t - CATEGORÍA\t - SUELDO");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        if (employees[0].equals(employees[1])) {
            System.out.println("El empledo Perez es igual al empleado Valdez");
        } else {
            System.out.println("Los empleados son diferentes");
        }
    }
}
