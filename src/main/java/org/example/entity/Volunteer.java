package org.example.entity;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "volunteer")

public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long volunteerId ;

    String name ;

    String surname ;

    Double salary ;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    Organization organization;

    @Embedded
    VolunteerSkill volunteerSkill;


}
