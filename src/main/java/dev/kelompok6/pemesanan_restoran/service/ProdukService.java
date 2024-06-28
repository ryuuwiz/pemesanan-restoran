package dev.kelompok6.pemesanan_restoran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kelompok6.pemesanan_restoran.dto.Mapper;
import dev.kelompok6.pemesanan_restoran.dto.ProdukDto;
import dev.kelompok6.pemesanan_restoran.repository.ProdukRepo;

@Service
public class ProdukService {

  @Autowired
  ProdukRepo produkRepo;

  public ProdukDto saveProduk(ProdukDto produkDto) {
    return Mapper.mapProdukDto(produkRepo.save(Mapper.mapProduk(produkDto)));
  }
}
