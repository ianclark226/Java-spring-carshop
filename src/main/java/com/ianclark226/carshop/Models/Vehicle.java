package com.ianclark226.carshop.Models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String name;
    @ManyToOne
    @JoinColumn(name="vehicletypeid", insertable=false, updatable=false)
    private VehicleType vehicleType;
    private Integer vehicletypeid;

    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name="vehiclemakeid", insertable=false, updatable=false)
    private VehicleMake vehicleMake;
    private Integer vehiclemakeid;

    private String power;
    private String fuelCapacity;
    @ManyToOne
    @JoinColumn(name="vehiclestatusid", insertable=false, updatable=false)
    private VehicleStatus vehicleStatus;
    private Integer vehiclestatusid;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name="employeeid", insertable=false, updatable=false)
    private Employee inCharge;
    private Integer employeeid;

    @ManyToOne
    @JoinColumn(name="vehiclemodelid", insertable=false, updatable=false)
    private VehicleModel vehicleModel;
    private Integer vehiclemodelid;

    @ManyToOne
    @JoinColumn(name="locationid", insertable=false, updatable=false)
    private Location currentLocation;
    private Integer locationid;

    private String remarks;
}
