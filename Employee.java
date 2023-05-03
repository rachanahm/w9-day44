//create class called Employee Accept Employee details such as id,name,address,profession,salary and create 5 employee details create ArrayList and all these user defined objects into ArrayList you have to perfrom these tasks and it should be menu driven 1.add employee 2.Update employee employee salary based on id 3remove employee based on employee id 4.Search employee name based on employee id, if it is found display otherwise if it not found throw NameNotFondException custom Exception 5.Exit
import java.util.ArrayList;
import java.util.Scanner;
class Employe{
  private int id;
  private String name;
  private String address;
  private String profession;
  private double salary;

  Employe(int id,String name,String address,String profession,double salary){
    this.id=id;
    this.name=name;
    this.address=address;
    this.profession=profession;
    this.salary=salary;
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getProfession() {
	return profession;
}

public void setProfession(String profession) {
	this.profession = profession;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
}
class Employee{
  public static void main(String args[]){
    ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
    do {
            System.out.println("1. Add employee");
            System.out.println("2. Update employee salary");
            System.out.println("3. Remove employee");
            System.out.println("4. Search employee name by id");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
      switch (choice) {
                case 1:
                    System.out.print("Enter employee id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter employee profession: ");
                    String profession = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(id, name, address, profession, salary));
                    System.out.println("Employee added successfully");
                    break;
                case 2:
                    System.out.print("Enter employee id: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                          System.out.println("Enter new salary");
                          double newSalary=scanner.nextDouble();
                          emp.setSalary(newSalary);
                          found=true;
                           System.out.println("Employee salary updated successfully");
                            break;
                        }
                    }
                   if (!found) {
                        System.out.println("Employee not found");
                    }
                    break;       
                case 3:
                   System.out.print("Enter employee id: ");
                   searchId = scanner.nextInt();
                   scanner.nextLine();
                   found = false;
                   for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                            employees.remove(emp);
                            found = true;
                            System.out.println("Employee removed successfully");
                            break;
                        }
                   }
                   if (!found) {
                        System.out.println("Employee not found");
                    }
                    break;
                 case 4:
                    System.out.print("Enter employee id: ");
                    searchId = scanner.nextInt();
                    scanner.nextLine(); 
                    found = false;
                    for (Employee emp : employees) {
                      
          
  }
}
  
}