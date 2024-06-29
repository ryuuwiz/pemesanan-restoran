package dev.kelompok6.pemesanan_restoran.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kelompok6.pemesanan_restoran.dto.FormPesananDto;
import dev.kelompok6.pemesanan_restoran.dto.Mapper;
import dev.kelompok6.pemesanan_restoran.dto.PesananDto;
import dev.kelompok6.pemesanan_restoran.model.Pesanan;
import dev.kelompok6.pemesanan_restoran.model.Produk;
import dev.kelompok6.pemesanan_restoran.repository.PesananRepo;
import dev.kelompok6.pemesanan_restoran.repository.ProdukRepo;

@Service
public class PesananService {

  @Autowired
  PesananRepo pesananRepo;

  @Autowired
  ProdukRepo produkRepo;

  public Pesanan savePesanan(FormPesananDto form) {
    Optional<Produk> produk = produkRepo.findById(form.getId_produk());
    Pesanan pesanan = new Pesanan();
    pesanan.setNama_pelanggan(form.getNama_pelanggan());
    pesanan.setNo_meja(form.getNo_meja());
    pesanan.setTgl_pesan(form.getTgl_pesan());
    pesanan.setJumlah(form.getJumlah());
    pesanan.setSubtotal(produk.get().getHarga() * Double.valueOf(form.getJumlah()));
    pesanan.setProduk(produk.get());
    return pesananRepo.save(pesanan);
  }

  public List<PesananDto> allPesanan() {
    return pesananRepo.findAll().stream().map(Mapper::mapPesananDto).collect(Collectors.toList());
  }

  public void deletePesanan(Integer id) {
    pesananRepo.deleteById(id);
  }
}
