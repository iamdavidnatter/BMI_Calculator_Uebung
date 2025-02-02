import static java.lang.Math.round;

public class BMICalculator {

    // Attribute:
    private String firstname;
    private String lastname;
    private int bodyHeight; // in cm
    private double bodyWeight; // in kg
    private char gender; // 'm' für männlich, 'w' für weiblich

    // Konstruktor:
    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    // Getter:
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    // Setter:
    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }


    /**
     *
     *
     *
     * Methode calculate BMI:
     */
    public double calculateBMI() {
        double heightInMeters = (double) bodyHeight / 100;
        double bmi = bodyWeight / (heightInMeters * heightInMeters);
        double round = Math.round(bmi * 100.0) / 100.0;
        return round;
    }


    /**
     *
     *
     *
     * Methode calculateBMICategory:
     */
    public int calculateBMICategory() {
        double bmi = calculateBMI();
        if (gender == 'm') {
            if (bmi < 16.0) return -2;
            if (bmi < 18.5) return -1;
            if (bmi < 25.0) return 0;
            if (bmi < 35.0) return 1;
            return 2;
        } else if (gender == 'w') {
            if (bmi < 15.0) return -2;
            if (bmi < 17.5) return -1;
            if (bmi < 24.0) return 0;
            if (bmi < 34.0) return 1;
            return 2;
        }
        return 0; // Standardwert
    }

    /**
     *
     *
     *
     * Methode getBMICategoryName():
     */
    public String getBMICategoryName(){
        int category = calculateBMICategory();
        switch (category){
            case -2:
                return "Sehr starkes Übergewicht";
            case -1:
                return "Untergewicht";
            case 0:
                return "Normalgewicht";
            case 1:
                return "Übergewicht";
            case 2:
                return "Sehr starkes Übergewicht";
            default:
                return "Unbekannte Kategorie";
        }
    }

}
