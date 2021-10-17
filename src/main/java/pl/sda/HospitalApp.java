package pl.sda;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Tadeusz", "Mrozinski", 17400, 1300));
        hospital.add(new Nurse("Aniela", "Kowalska", 2340, 6));
        hospital.add(new Nurse("Katarzyna", "Manierska", 1970, 3));

        System.out.println("Wszyscy pracownicy szpitala: ");
        System.out.println(hospital);
    }
}
