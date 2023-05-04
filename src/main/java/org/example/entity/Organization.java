package org.example.entity;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "organization")


public class Organization {

    /*** Manual adjustment of the generator ***/
//    @SequenceGenerator(
//            name = "sequence_organization",
//            sequenceName = "sequence_organization",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//                strategy = GenerationType.SEQUENCE,
//            generator = "sequence_organization"
//    )
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    String name ;

    String department ;

    @OneToMany(cascade = CascadeType.PERSIST)
    List<Volunteer> volunteers;

    @JoinTable(
            name = "organization_material"
    )
    @ElementCollection
    List<OrganizationMaterial> organizationMaterial;

}

