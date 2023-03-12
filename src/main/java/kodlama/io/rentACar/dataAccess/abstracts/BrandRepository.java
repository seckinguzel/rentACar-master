package kodlama.io.rentACar.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    boolean existsByName(String name); //Jpa creates a special query when it got the "exists" keyword.
    //We could use like below comments in different scenarios.

    //Brand findByName(String name);
    //List<Brand> findByName(String name);
}
