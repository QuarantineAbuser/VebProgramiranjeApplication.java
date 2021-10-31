package mk.ukim.finki.vebprogramiranje.repository;

import mk.ukim.finki.vebprogramiranje.bootstrap.DataHolder;
import mk.ukim.finki.vebprogramiranje.model.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class InMemoryManufacturerRepository {

    public List<Manufacturer> findAll(){
        return DataHolder.manufacturers;
    }
    public Optional<Manufacturer> findById(Long id){
        return DataHolder.manufacturers.stream().filter(m->m.getId().equals(id)).findFirst();
    }
}
