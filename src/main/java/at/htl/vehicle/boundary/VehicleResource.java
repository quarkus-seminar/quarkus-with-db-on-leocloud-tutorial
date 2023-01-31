package at.htl.vehicle.boundary;

import at.htl.vehicle.control.VehicleRepository;
import at.htl.vehicle.entity.Vehicle;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("vehicle")
public class VehicleResource {

    @Inject
    VehicleRepository vehicleRepository;

    @GET
    public List<Vehicle> getAll() {
        return vehicleRepository.listAll();
    }

}
