package it.polito.project;

public class Slot {

    private String dateString;
    private Integer dateInt;
    private String startString;
    private String endString;
    private Integer startInt;
    private Integer endInt;

    
    public Slot(String date, String startString, String endString) {
        this.dateString=date;
        this.startString = startString;
        this.endString = endString;

        String[] s = date.split("-");
        this.dateInt=Integer.parseInt(s[0]+s[1]+s[2]);

        String[] sStart = startString.split(":");
        this.startInt= Integer.parseInt(sStart[0]+sStart[1]);
        String[] sEnd = endString.split(":");
        this.endInt= Integer.parseInt(sEnd[0]+sEnd[1]);
    }

    public String getStartString() {
        return startString;
    }
    public String getEndString() {
        return endString;
    }
    public Integer getStartInt() {
        return startInt;
    }
    public Integer getEndInt() {
        return endInt;
    }
    public String getDateString() {
        return dateString;
    }


    public Integer getDateInt() {
        return dateInt;
    }

    public double getDuration(){
        String[] startS = this.startString.split(":");
        String[] endS = this.endString.split(":");
        int s = (Integer.parseInt(startS[0])*60) + Integer.parseInt(startS[1]);
        int e = (Integer.parseInt(endS[0])*60) + Integer.parseInt(endS[1]);
        int ris = e - s;
        return ris/60;
    }

    @Override
    public String toString() {
        return this.startString + "-" + this.endString;
    }

    
    

    

}
