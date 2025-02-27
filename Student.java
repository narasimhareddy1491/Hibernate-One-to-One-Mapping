package org.example;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    public int id;
    @Column(nullable = false, length = 20)
    public String firstName;
    public String lastName;
    public Long marks;

    @Column(unique = true)
    public String email;

    @Transient
    public int age;

    @OneToOne

    public Address address;
}
