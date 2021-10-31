package mk.ukim.finki.vebprogramiranje.service;

import mk.ukim.finki.vebprogramiranje.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    Optional<Manufacturer> findById(Long id);
    List<Manufacturer> findAll();
}
