package HospitalManagement;

public class Main {
    public static void main(String[] args) {
        // create a patient object
        Patient patient1 = new Patient(
            "Alice",
             30, 
             "Female",
              "123 Main St",
               "555-1234", 
               "Flu"
            );
        // create a doctor object
        Doctor doctor1 = new Doctor(
            "Dr. Smith",
            "Cardiology", 
             "555-5678"
            );
            //Display patient and doctor information
        System.out.println("Patient Information:");
              patient1.displayDetails();
              patient1.viewRecords();
        System.out.println("Doctor Information:");
        System.out.println(doctor1);
                doctor1.displayDetails();
                doctor1.diagnose(patient1);

                //create appointment
                Appointment appointment1 = new Appointment(
                    patient1,
                     doctor1, 
                     "2024-07-01", 
                     "10:00 AM"
                    );
                    System.out.println("Appointment Information:");
                    System.out.println(appointment1);

                    //create medical record
                    Medicalrecords medicalrecord1 = new Medicalrecords(
                        patient1,
                         "2024-07-01",
                          "Prescribed medication for flu symptoms"
                        );
                        System.out.println("Medical Record Information:");
                        System.out.println(medicalrecord1);

                        //create billing information
                        Billing billing1 = new Billing(
                            patient1,
                             200.0, 
                             "2024-07-01"
                            );
                            System.out.println("Billing Information:");
                            System.out.println(billing1);

        
    }
    
}
