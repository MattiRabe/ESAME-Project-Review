package it.polito.project;

public class Preference {
    
    private String email;
    private String name;
    private String surname;
    private String reviewId;
    private String date;
    private String slotStr;
    private Slot slot;


    public Preference(String email, String name, String surname, String reviewId, String date, String slot, Slot s) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.reviewId = reviewId;
        this.date = date;
        this.slotStr = slot;
        this.slot=s;
    }


    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getReviewId() {
        return reviewId;
    }


    public String getDate() {
        return date;
    }


    public String getSlotStr() {
        return slotStr;
    }

    


    @Override
    public String toString() {
        return date + "T" + slot + "=" + email;
    }


    public Slot getSlot() {
        return slot;
    }

    //YYYY-MM-DDThh:mm-hh:mm=EMAIL
    

}
