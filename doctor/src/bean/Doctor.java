package bean;

public class Doctor {
private int id;
private String name;
private double salary;
private String specialization;
public Doctor() {
	super();
}
public Doctor(int id, String name, double salary, String specialization) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.specialization = specialization;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public void displayDoctorInfo() {
	System.out.println(id+" "+name+" "+salary+" "+specialization);
}
@Override
public String toString() {
	return "Doctor [id=" + id + ", name=" + name + ", salary=" + salary + ", specialization=" + specialization + "]";
}

}
