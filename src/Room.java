public class Room implements Location{
    private String roomNumber;
    private String building;

    public Room(String roomNumber, String building) {
        this.roomNumber = roomNumber;
        this.building = building;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
    @Override
    public String getDescription(){
        String description="Místnost " + this.getRoomNumber();
        if(!this.building.isEmpty()) {
            description=description.concat(" (").concat(this.building).concat(")");
        }
        return description;
    }
}
