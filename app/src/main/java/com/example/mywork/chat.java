package com.example.mywork;

public class chat {
    private int imageid;
    private String name;
    private String message;
    private int id;


    public chat(int id, int imageid, String name, String message) {
        this.id = id;
        this.imageid = imageid;
        this.name = name;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public int getImageid() {
        return imageid;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
