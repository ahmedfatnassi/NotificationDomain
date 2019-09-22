package com.notification.domain.notification.notification.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper =   false )
@Entity
@Table(name ="admin")
public class Admin extends AbstractEntity {
    @Column(name = "firstname")
    private String firstname ;
    @Column(name = "lastname")
    private String lastname  ;
    @Column(name = "serial_number")
    private String seriale_number ;


}
