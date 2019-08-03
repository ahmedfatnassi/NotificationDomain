package com.notification.domain.notification.notification.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data // lombok annotation generate getters for all field , tosting  and hashcode and equals implementations that check all non-transient(permanent ) field
@NoArgsConstructor // lombok generate no-args constructor
@AllArgsConstructor// lombok all args constructor
@EqualsAndHashCode(callSuper =   false ) // column definition name length and nullability constraint
@Entity // entity and column will named cart
@Table(name ="notification")

public class Notification extends AbstractEntity {
private static final long serialVersionID = 1L ;
@Column(name="isread")
private boolean isRead ;
@Column(name = "readat")
private  Instant readAt  ;
@Column(name = "template")
private String template ;
@ManyToOne
private PubsTracker pubsTracker ;
@OneToMany
 private   Long userID ;


}
