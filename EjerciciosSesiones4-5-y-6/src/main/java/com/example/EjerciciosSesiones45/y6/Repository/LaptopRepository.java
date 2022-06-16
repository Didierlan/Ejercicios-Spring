package com.example.EjerciciosSesiones45.y6.Repository;


import com.example.EjerciciosSesiones45.y6.entitis.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
