package dev.kelompok6.pemesanan_restoran.dto;

import lombok.Data;

@Data
public class ProdukDto {
  private int id;
  private String nama_produk;
  private double harga;
}
