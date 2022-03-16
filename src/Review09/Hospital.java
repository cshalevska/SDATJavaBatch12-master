package Review09;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("John","Smith","Surgeon");
        doc.printInfo();
      Doctor doc1=new Doctor("Jane","Smith");
doc1.printInfo();
        System.out.println(" change value of instance variable");
doc.speciality="Determologis";
doc1.printInfo();

        System.out.println("Change the value ");
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();
    }
}
