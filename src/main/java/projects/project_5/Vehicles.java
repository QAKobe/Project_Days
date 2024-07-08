package projects.project_5;

public class Vehicles {

    public Vehicles(String make, String model, String madeIn, int year, int mileage) {

        this.make = make;
        this.model = model;
        this.madeIn = madeIn;
        this.year = year;
        this.mileage = mileage;

    }

    private String make;
    private String model;
    private String madeIn;
    private int year;
    private int mileage;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String toString(){
        return make + " " + model;
    }
}
