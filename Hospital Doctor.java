import java.util.ArrayList;

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;

    Hospital(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void showDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor d : doctors) {
            System.out.println(d.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr. Smith");
        Doctor doc2 = new Doctor("Dr. Lee");

        Hospital hospital = new Hospital("City Hospital");
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        hospital.showDoctors();
    }
}
