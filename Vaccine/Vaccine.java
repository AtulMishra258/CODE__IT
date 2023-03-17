
package Vaccine;

abstract class Vaccine {
// method for first dose
public void firstDose(String nationality, int age) {
   if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
       System.out.println("First dose is done successfully.");
   } else {
       System.out.println("Sorry, you are not eligible for the first dose.");
   }
}

// method for second dose
public void secondDose(boolean isFirstDoseCompleted) {
   if (isFirstDoseCompleted) {
       System.out.println("Second dose is done successfully.");
   } else {
       System.out.println("Sorry, you need to complete your first dose before taking the second dose.");
   }
}

 public abstract void boosterDose();

}

 


