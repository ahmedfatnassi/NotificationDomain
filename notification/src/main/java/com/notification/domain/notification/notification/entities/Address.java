package com.notification.domain.notification.notification.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper =   false )
@Entity
@Table(name ="address")
public class Address  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
    @Column(name = "address")
    private String address ;
    @Column(name="state" )
    private String state ;
    @Column(name = "city")
    private  String city ;
    @Column(name = "region")
    private  String region ;
    @Column(name = "color")
    private String color ;
    @Column(name = "capacity")
    private String capacity ;
    @Column(name="latitude")
    private String  latitude ;
    @Column(name="langitude ")
    private String  langitude  ;


    public Address(String address,String state , String region , String city , String color, String capacity,String latitude,String langitude) {
        this.state= state ;
        this.city =city ;
        this.region = region ;
        this.address = address;
        this.color = color;
        this.capacity = capacity;
        this.latitude=latitude ;
        this.langitude=langitude;
    }

}
