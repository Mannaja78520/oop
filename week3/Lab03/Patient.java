public class Patient {
    private long id;
    private String name;
    private int birthYear = 2000;
    private double height = 150.0;
    private double weight = 50.0;
    
    public Patient(long id, String name, int birthYear, double height, double weight) {
        this.id = id;
        this.name = name;

        if (birthYear < 0) System.out.println("Invite birthday input, Change to defaultBirthYear.");
        else this.birthYear = birthYear;
        
        if (height < 0) System.out.println("Invalid height input, Change to defaultHeight.");
        else this.height = height;

        if (weight < 0) System.out.println("Invalid weight input, Change to defaultWeight.");
        else this.weight = weight;
    }

    public long getId() {
        return this.id;
    }

    public double getHeight() {
        return this.height;
    }

    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }

    public String getName() {
        return this.name;
    }

    public void displayDetails(int currentYear) { 
        System.out.println("Patient Name: " + name); 
        System.out.println("Patient Age: " + getAge(currentYear)); 
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
      }
  
      
}
