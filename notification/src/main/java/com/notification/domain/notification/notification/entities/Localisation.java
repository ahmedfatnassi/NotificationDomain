package com.notification.domain.notification.notification.entities;

import com.opencsv.bean.CsvBindByPosition;
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
@Table(name ="localisation")
public class Localisation  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
    @CsvBindByPosition(position = 0)
    @Column(name = "latitude")
    private String  latitude ;
    @CsvBindByPosition(position = 1)
    @Column(name = "longitude")
    private String longitude  ;
    @Column(name = "type ")
    private Types type  ;
    @Column(name = "date")
    private Date date ;


    public Localisation(String latitude, String longitude, Types type,Date date ) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.date = date ;
    }
}
