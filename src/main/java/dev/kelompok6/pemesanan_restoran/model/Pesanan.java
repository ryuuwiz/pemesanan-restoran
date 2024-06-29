package dev.kelompok6.pemesanan_restoran.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Pesanan {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_pesanan;

  @NotBlank
  private String nama_pelanggan;

  @NotNull
  private int no_meja;

  @NotNull
  private String tgl_pesan;

  @NotNull
  private int jumlah;

  @NotNull
  private double subtotal;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_produk")
  private Produk produk;
}
