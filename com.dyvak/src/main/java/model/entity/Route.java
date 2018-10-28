package model.entity;

import model.builder.RouteBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class Route {

    private int id;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public static RouteBuilder builder(){
        return new RouteBuilder();
    }
}
