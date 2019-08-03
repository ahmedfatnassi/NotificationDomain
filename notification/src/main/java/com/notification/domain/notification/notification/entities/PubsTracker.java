package com.notification.domain.notification.notification.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper =   false )
@Entity
@Table(name ="notification")

public class PubsTracker extends   AbstractEntity{
@Column(name="pricemin")
    private String pricemin ;
@Column(name ="pricemax" )
private String pricemax ;
@Column(name = "city")
private String  city ;
@Column(name = "distance")
private String distance  ;
@ManyToOne
    private Long pubId ;
}
