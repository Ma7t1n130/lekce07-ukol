import java.time.LocalDate;

public class Vehicle extends Asset{
    private int mileage;
    private LocalDate roadWorthinessTest;

    public Vehicle(String idNumber, String description, int mileage, LocalDate roadWorthinessTest) {
        super(idNumber, description);
        this.mileage = mileage;
        this.roadWorthinessTest = roadWorthinessTest;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public LocalDate getRoadWorthinessTest() {
        return roadWorthinessTest;
    }

    public void setRoadWorthinessTest(LocalDate roadWorthinessTest) {
        this.roadWorthinessTest = roadWorthinessTest;
    }

    @Override
    public String toString() {
        return this.getIdNumber()+" ("+this.getDescription()+", "+this.getMileage()+"km)";
    }
}
