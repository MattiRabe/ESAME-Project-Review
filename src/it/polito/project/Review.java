package it.polito.project;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Review {
    private static final int BASE = 1;
    private static int INCREMENTER = 0;

    private String id;
    private String title;
    private String topic;
    private String group;
    private HashMap<String, List<Slot>> calendar = new HashMap<>();
    
    
    public Review(String title, String topic, String group) {
        this.title = title;
        this.topic = topic;
        this.group = group;
        this.id = Integer.toString(BASE + INCREMENTER++);

    }


    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getTopic() {
        return topic;
    }
    public String getGroup() {
        return group;
    }

    public HashMap<String, List<Slot>> getCalendar() {
        return calendar;
    }

    public Boolean addSlot(String date, Slot s){
        if(!calendar.containsKey(date)){
            List<Slot> l = new LinkedList<>();
            calendar.put(date, l);
            calendar.get(date).add(s);
            return true;
        }
        for(Slot ss : calendar.get(date)){
            if(s.getEndInt()<=ss.getEndInt() && s.getStartInt()>=ss.getStartInt()) return false;
            if(s.getEndInt()<=ss.getEndInt() && s.getEndInt()>=ss.getStartInt()) return false;
            if(s.getStartInt()<=ss.getEndInt() && s.getStartInt()>=ss.getStartInt()) return false;
        }
        calendar.get(date).add(s);
        return true;
    }
    

    

}
