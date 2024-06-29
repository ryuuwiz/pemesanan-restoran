package dev.kelompok6.pemesanan_restoran.dto;

import lombok.Data;

import dev.kelompok6.pemesanan_restoran.model.Produk;

@Data
public class PesananDto {
  private int id_pesanan;
  private String nama_pelanggan;
  private int no_meja;
  private String tgl_pesan;
  private int jumlah;
  private double subtotal;
  private Produk produk;
}
