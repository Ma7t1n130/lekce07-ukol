public class Computer extends Asset{
    private ComputerType computerType;

    public Computer(String idNumber, String description, ComputerType computerType) {
        super(idNumber, description);
        this.computerType = computerType;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    @Override
    public String toString() {
        return this.getIdNumber()+" ("+this.getDescription()+", "+this.getComputerType()+")";
    }
}
