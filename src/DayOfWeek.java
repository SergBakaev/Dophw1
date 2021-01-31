public enum DayOfWeek {

    Monday(1,8),
    Tuesday(2,8),
    Wednesday(3,8),
    Thursday(4,8),
    Friday(5,8),
    Saturday(6,0),
    Sunday(7,0);

    private int workingHours;
    private int numWeek;

    DayOfWeek(int numWeek, int workingHours){
        this.workingHours = workingHours;
        this.numWeek = numWeek;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public int getNumWeek() {
        return numWeek;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setNumWeek(int numWeek) {
        this.numWeek = numWeek;
    }
}
