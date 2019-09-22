package com.notification.domain.notification.notification.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper =   false )
@Entity
@Table(name ="events")
public class Events  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;   @Column(name = "sujet")
    private  String sujet ;
    @Column(name = "description")
    private String description ;
    @Column(name = "cin")
    private String cin ;
    @Column(name = "number")
    private String number ;
    @Column(name = "name")
    private String name ;
    @Column(name = "date")
    private Date date ;

    public Events(String sujet, String description, String cin, String number, String name, Date date) {
        this.sujet = sujet;
        this.description = description;
        this.cin = cin;
        this.number = number;
        this.name = name;
        this.date = date;
    }

}
