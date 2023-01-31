package at.htl.tutorial.vehicle;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("vehicle")
public class VehicleResource {

    @Inject
    VehicleRepository vehicleRepository;

    @Inject
    VehicleMapper vehicleMapper;

    @GET
    public List<VehicleDto> getAll() {
        return vehicleRepository
                .listAll()
                .stream()
                .map(vehicle -> vehicleMapper.toDto(vehicle))
                .toList();
    }

}
