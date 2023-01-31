package at.htl.tutorial.vehicle;

import at.htl.tutorial.MyColor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;
import java.time.LocalDate;

public record VehicleDto(
        Long id,
        String brand,
        String model,
        MyColor color,
        LocalDate firstRegistration,
        String imageName,
        byte[] image

) {
}
