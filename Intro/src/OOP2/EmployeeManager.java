package OOP2;

public class EmployeeManager {
    private Logger[] loggers;

    public EmployeeManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Employee employee) {
        for (Logger item:loggers){
        item.log("deneme");
        }
    }

}
