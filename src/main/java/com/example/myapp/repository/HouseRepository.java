package com.example.myapp.repository;

import com.example.myapp.domain.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {
    @Query("select h from House h where h.houseName = :houseName")
    abstract House findHouseByName(String houseName);
}
