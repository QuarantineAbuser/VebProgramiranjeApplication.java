package mk.ukim.finki.vebprogramiranje.service.impl;

import mk.ukim.finki.vebprogramiranje.model.Manufacturer;
import mk.ukim.finki.vebprogramiranje.repository.InMemoryManufacturerRepository;
import mk.ukim.finki.vebprogramiranje.service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final InMemoryManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImpl(InMemoryManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return manufacturerRepository.findById(id);
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }
}
