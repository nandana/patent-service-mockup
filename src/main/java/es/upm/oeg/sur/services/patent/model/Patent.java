package es.upm.oeg.sur.services.patent.model;

import java.time.LocalDate;

public class Patent {

    String id;

    String title;

    String location;

    LocalDate date;

    public Patent() {

    }

    public Patent(String id, String title, String location, LocalDate date) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
