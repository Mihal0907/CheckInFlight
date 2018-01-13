package ua.artcode.model;

import java.util.Date;

public class Flight {

    private int id;
    private City from;
    private City to;
    private Date data;

    public Flight(int id, City from, City to, Date data) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
