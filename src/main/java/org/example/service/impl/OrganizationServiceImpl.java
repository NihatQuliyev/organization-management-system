package org.example.service.impl;

import org.example.entity.Organization;
import org.example.entity.OrganizationMaterial;
import org.example.service.OrganizationService;
import org.example.service.VolunteerService;

import java.util.List;

public class OrganizationServiceImpl implements OrganizationService {

    public List<OrganizationMaterial> organizationMaterial() {
        return List.of(OrganizationMaterial.builder()
                .url("www.organization.com")
                .email("organization@gmail.com")
                .build());
    }
    public Organization bmwOrganization() {

        VolunteerService volunteerService = new VolunteerServiceImpl();

        return Organization.builder()
                .name("BMW")
                .department("car")
                .volunteers(volunteerService.bmwVolunteers())
                .organizationMaterial(organizationMaterial())
                .build();
    }

    public Organization mercedesOrganization() {

        VolunteerService volunteerService = new VolunteerServiceImpl();

        return Organization.builder()
                .name("Mercedes")
                .department("car")
                .volunteers(volunteerService.mercedesVolunteers())
                .organizationMaterial(organizationMaterial())
                .build();
    }

    public Organization toyotaOrganization() {

        VolunteerService volunteerService = new VolunteerServiceImpl();

        return Organization.builder()
                .name("Prado")
                .department("car")
                .volunteers(volunteerService.toyotaVolunteers())
                .organizationMaterial(organizationMaterial())
                .build();
    }


}
