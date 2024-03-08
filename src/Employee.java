public class Employee implements Location{
   private String firstName;
   private String surName;
   private String jobTitle;

    public Employee(String firstName, String surName, String jobTitle) {
        this.firstName = firstName;
        this.surName = surName;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getDescription(){
        return this.firstName + " "+ this.surName+" ("+this.jobTitle+")";
    }

}
