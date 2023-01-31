package at.htl.vehicle.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@JsonPropertyOrder({"id","brand","model","color", "firstRegistration", "image-name"})
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    @Enumerated(EnumType.STRING)
    private MyColor color;

    @Column(name = "FIRST_REGISTRATION")
    @JsonProperty("first-registration")
    private LocalDate firstRegistration;

    @Column(name = "IMAGE_NAME")
    @JsonProperty("image-name")
    private String imageName;

    @Transient
    @JsonIgnore
    private byte[] image;


    public Vehicle() {
    }

    public Vehicle(String brand, MyColor color, LocalDate firstRegistration, String model) {
        this.brand = brand;
        this.color = color;
        this.firstRegistration = firstRegistration;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MyColor getColor() {
        return color;
    }

    public void setColor(MyColor color) {
        this.color = color;
    }

    public LocalDate getFirstRegistration() {
        return firstRegistration;
    }

    public void setFirstRegistration(LocalDate firstRegistration) {
        this.firstRegistration = firstRegistration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}