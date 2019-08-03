package com.notification.domain.notification.notification.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

// because every class hve crate delete and update so we wil use abstract
@Getter
@Setter
@MappedSuperclass //annotate the  base cass which holds properties will be inherited .
@EntityListeners(AuditingEntityListener.class) //activate  the auditing in spring data jpa
public  abstract  class AbstractEntity implements Serializable {
    private static final long serialVersioID  = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
    @CreatedDate //
    @Column( name ="created_date",nullable = false)
    @JsonIgnore//
    private Instant createDate = Instant.now() ;
    @LastModifiedDate //this field will be filled auto based on the corresponding annotation by anditingEntitylistner
    @Column(name = "last_modified_date")
    @JsonIgnore
    private Instant lastModifiedate = Instant.now() ;
}
