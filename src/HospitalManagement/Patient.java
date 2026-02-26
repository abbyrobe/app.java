package HospitalManagement;
public class Patient {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String medicalCondition;

    // Constructor
    public Patient(String name, int age, String gender, String address, String phoneNumber, String medicalCondition) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCondition = medicalCondition;
    }
    //Gettter for name
    public String getName() {
        return name;
    }
    //Getter for medical condition
    public String getMedicalCondition() {
        return medicalCondition;
    }

    //Methods to display patient details and view medical records
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Medical Condition: " + medicalCondition);
    }
   // View medical records method
    public void viewRecords() {
    System.out.println("Medical records for " + name + ":");
    System.out.println("Medical Condition: " + medicalCondition);
    }
}