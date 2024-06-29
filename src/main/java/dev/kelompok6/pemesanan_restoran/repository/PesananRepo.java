package dev.kelompok6.pemesanan_restoran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.kelompok6.pemesanan_restoran.model.Pesanan;

@Repository
public interface PesananRepo extends JpaRepository<Pesanan, Integer> {
}
