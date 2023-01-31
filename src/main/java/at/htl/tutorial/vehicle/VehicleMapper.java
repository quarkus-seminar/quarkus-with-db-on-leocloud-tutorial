package at.htl.tutorial.vehicle;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleMapper {
    public VehicleDto toDto(Vehicle vehicle) {
        return new VehicleDto(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getColor(),
                vehicle.getFirstRegistration(),
                vehicle.getImageName(),
                vehicle.getImage()
        );
    }

    public Vehicle fromDto(VehicleDto vehicleDto) {
        var vehicle = new Vehicle(
                vehicleDto.brand(),
                vehicleDto.color(),
                vehicleDto.firstRegistration(),
                vehicleDto.model()
        );
        vehicle.setId(vehicleDto.id());
        vehicle.setImageName(vehicleDto.imageName());
        vehicle.setImage(vehicleDto.image());
        return vehicle;
    }
}
