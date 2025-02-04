package com.ianclark226.carshop.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicleid", insertable=false, updatable=false)
    private Vehicle vehicle;
    private int vehicleid;

    @ManyToOne
    @JoinColumn(name="locationid1", insertable=false, updatable=false)
    private Location location1;
    private int locationid1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date1;

    @ManyToOne
    @JoinColumn(name="locationid2", insertable=false, updatable=false)
    private Location location2;
    private int locationid2;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date2;

    private String remarks;
}
