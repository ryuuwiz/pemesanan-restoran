package dev.kelompok6.pemesanan_restoran.service;

import java.util.List;
import java.util.stream.Collectors;

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

  public List<ProdukDto> allProduk() {
    return produkRepo.findAll().stream().map(Mapper::mapProdukDto).collect(Collectors.toList());
  }

  public void deleteProduk(Integer id) {
    produkRepo.deleteById(id);
  }
}
