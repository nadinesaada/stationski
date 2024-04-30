package com.example.demo.DAO;

import com.example.demo.entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStationRepo extends JpaRepository<Station,Long> {
}
