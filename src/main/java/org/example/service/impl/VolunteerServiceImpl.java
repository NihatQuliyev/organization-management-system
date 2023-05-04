package org.example.service.impl;

import org.example.entity.Volunteer;
import org.example.entity.VolunteerSkill;
import org.example.service.VolunteerService;

import java.util.List;

public class VolunteerServiceImpl implements VolunteerService {

    public List<Volunteer> bmwVolunteers() {


        Volunteer ferid = Volunteer.builder()
                .name("Ferid")
                .surname("Tahmazov")
                .salary(2500.0)
                .volunteerSkill(VolunteerSkill.builder()
                        .language("English")
                        .hobby("piano")
                        .experience("Senior developer")
                        .build())
                .build();

        Volunteer nihat =Volunteer.builder()
                .name("Nihat")
                .surname("Quliyev")
                .salary(2500.0)
                .volunteerSkill(VolunteerSkill.builder()
                        .language("English")
                        .hobby("carDriver")
                        .experience("Junior developer")
                        .build())
                .build();

        return List.of(ferid,nihat);
    }

    public List<Volunteer> mercedesVolunteers() {
        Volunteer elchin =  Volunteer.builder()
                .name("Elchin")
                .surname("Huseynli")
                .salary(2500.0)
                .volunteerSkill(VolunteerSkill.builder()
                        .language("English")
                        .hobby("book ready")
                        .experience("Junior developer")
                        .build())
                .build();


        Volunteer xedice = Volunteer.builder()
                .name("Xedice")
                .surname("Madnayeva")
                .salary(5000.0)
                .volunteerSkill(VolunteerSkill.builder()
                        .language("English")
                        .hobby("skate driver")
                        .experience("Junior developer")
                        .build())
                .build();

       return List.of(xedice,elchin);
    }

    public List<Volunteer> toyotaVolunteers() {
        Volunteer elchin =  Volunteer.builder()
                .name("Tamerlan")
                .surname("Ceferquluzade")
                .salary(2500.0)
                .volunteerSkill(VolunteerSkill.builder()
                        .language("Russian")
                        .hobby("carDriver")
                        .experience("Senior developer")
                        .build())
                .build();


        Volunteer xedice = Volunteer.builder()
                .name("Terane")
                .surname("Nesirova")
                .salary(5000.0)
                .volunteerSkill(VolunteerSkill.builder()
                        .language("English")
                        .hobby("reading")
                        .experience("Senior developer")
                        .build())
                .build();

        return List.of(xedice,elchin);
    }
}
