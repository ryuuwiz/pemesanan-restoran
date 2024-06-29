package dev.kelompok6.pemesanan_restoran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.kelompok6.pemesanan_restoran.service.PesananService;
import dev.kelompok6.pemesanan_restoran.service.ProdukService;

@Controller
@RequestMapping
public class ViewController {

  @Autowired
  ProdukService produkService;

  @Autowired
  PesananService pesananService;

  @GetMapping
  public String index() {
    return "home";
  }

  @GetMapping("pesanan")
  public String pesanan(Model model) {
    model.addAttribute("allProduk", produkService.allProduk());
    model.addAttribute("allPesanan", pesananService.allPesanan());
    return "pesanan";
  }

  @GetMapping("produk")
  public String produk(Model model) {
    model.addAttribute("allProduk", produkService.allProduk());
    return "produk";
  }

  @GetMapping("laporan")
  public String laporan(Model model) {
    int total = 0;
    for (int i = 0; i < pesananService.allPesanan().size(); i++) {
      total += pesananService.allPesanan().get(i).getSubtotal();
    }
    model.addAttribute("allPesanan", pesananService.allPesanan());
    model.addAttribute("total", total);
    return "laporan";
  }

}
