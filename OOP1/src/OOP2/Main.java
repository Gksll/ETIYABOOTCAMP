package OOP2;

public class Main {
    public static void main(String[] args)
    {
        Logger[] loggers = {new ElasticLogger(), new CloudLogger(), new DatabaseLogger()};

//        CustomerManager customerManager = new CustomerManager(logger);
//        customerManager.add(new Customer());
        Employee employee= new Employee();
        EmployeeManager employeeManager = new EmployeeManager(loggers);
        employeeManager.add(employee);
    }
}
