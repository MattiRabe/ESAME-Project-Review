package it.polito.project;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class Review {
    private static final int BASE = 1;
    private static int INCREMENTER = 0;

    private String id;
    private String title;
    private String topic;
    private String group;
    private HashMap<String, List<Slot>> calendar = new HashMap<>();
    private Boolean status; 
    private TreeMap<String, Preference> preferences = new TreeMap<>();
    
    
    public Review(String title, String topic, String group) {
        this.title = title;
        this.topic = topic;
        this.group = group;
        this.id = Integer.toString(BASE + INCREMENTER++);
        this.status=false;

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
            if(s.getStartInt()<ss.getEndInt() && ss.getStartInt()<s.getEndInt()) return false;
        }
        calendar.get(date).add(s);
        return true;
    }

    public Boolean isOpened() {
        return status;
    }

    public void openPoll(){
        this.status=true;
    }

    public void closePoll(){
        this.status=false;
    }


    public TreeMap<String, Preference> getPreferences() {
        return preferences;
    }

    public void addPreference(Preference p){
        preferences.put(p.getEmail(), p);
    }

    



}
