package at.htl.tutorial.vehicle;

import at.htl.tutorial.MyColor;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class VehicleMapperTest {

    @Inject
    VehicleMapper vehicleMapper;

    @Test
    void toDtoTest() {
        var vehicle = new Vehicle("Tesla",
                MyColor.BLACK,
                LocalDate.of(2021, 11, 1),
                "Model 3");

        var vehicleDto = vehicleMapper.toDto(vehicle);
        assertThat(vehicleDto.brand()).isEqualTo("Tesla");
        assertThat(vehicleDto.color()).isEqualTo(MyColor.BLACK);
        assertThat(vehicleDto.firstRegistration()).isEqualTo(LocalDate.of(2021, 11, 1));
        assertThat(vehicleDto.model()).isEqualTo("Model 3");

    }
}