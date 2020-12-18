package lesson10.task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class SalaryDocument implements Generatable, Save{
    private List<Employee> employees;
    private Double total;
    private String uuid;
    private String operationDate;

    public SalaryDocument generate(){
       int countEmployees=Property.SALARY_EMPLOYEE_COUNT;
       for ( int i=0;i<=countEmployees;i++){
           Employee employee= new Employee().generate();
           employees.add(employee);
           total+=employee.getSalary();

       }
        total*=100;
        total=1d * Math.round(total) / 100;
        uuid=  UUID.randomUUID().toString();
        operationDate = new SimpleDateFormat(Property.SALARY_DATE_FORMAT).format(new Date(new Date().getTime() + 86400000L));
        DocumentQueue.QUEUE.add(this);
        return this;


    }

    @Override
    public void save() throws IOException {
        System.out.println(toString());
        FileWriter writer = new FileWriter(Property.SALARY_OUTPUT_FILE);
        writer.write(toString());
        writer.flush();
        writer.close();
    }
}
