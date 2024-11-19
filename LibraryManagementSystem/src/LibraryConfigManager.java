public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFee;
    private String openingHours;

    private LibraryConfigManager() {
        // Default settings
        this.lateFee = 0.5;
        this.openingHours = "9 AM - 5 PM";
    }


    public static synchronized LibraryConfigManager getInstance(){
        if(instance == null){
            instance = new LibraryConfigManager();
        }
        return instance;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}

