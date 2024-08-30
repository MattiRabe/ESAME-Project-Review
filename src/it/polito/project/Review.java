package it.polito.project;

public class Review {
    private static final int BASE = 1;
    private static int INCREMENTER = 0;

    private String id;
    private String title;
    private String topic;
    private String group;

    
    
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

    

}
