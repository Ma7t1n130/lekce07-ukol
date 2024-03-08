public class Asset {
    private String idNumber;
    private String description;

    private Location location;

    public Asset(String idNumber, String description) {
        this.idNumber = idNumber;
        this.description = description;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getReportLine(){
        return this.toString()+" -> "+this.getLocation().getDescription();
    }
}
