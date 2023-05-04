package org.example.service;

import org.example.entity.Volunteer;

import java.util.List;

public interface VolunteerService {
    List<Volunteer> bmwVolunteers();
    List<Volunteer> mercedesVolunteers();
    List<Volunteer> toyotaVolunteers();

}
