package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

    @Id
    public int id;
    public String lineOne;
    public String lineTwo;
    public String city;

    public String zipcode;

    /*@OneToOne(mappedBy = "address")
    public Student student;*/

}
