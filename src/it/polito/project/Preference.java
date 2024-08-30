package it.polito.project;

public class Preference {
    
    private String email;
    private String name;
    private String surname;
    private String reviewId;
    private String date;
    private String slot;


    public Preference(String email, String name, String surname, String reviewId, String date, String slot) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.reviewId = reviewId;
        this.date = date;
        this.slot = slot;
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


    public String getSlot() {
        return slot;
    }


    @Override
    public String toString() {
        return date + "T" + slot + "=" + email;
    }

    //YYYY-MM-DDThh:mm-hh:mm=EMAIL
    

    

}
