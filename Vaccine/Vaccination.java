
package Vaccine;


public class Vaccination {
public static void main(String[] args) {
   VaccinationSuccessful va = new VaccinationSuccessful();
   
   va.firstDose("Indian", 30);
   
   va.secondDose(true);
   
   // Call booster dose method
   va.boosterDose();
}
}
