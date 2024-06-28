package dev.kelompok6.pemesanan_restoran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.kelompok6.pemesanan_restoran.service.ProdukService;

@Controller
@RequestMapping
public class ViewController {

  @Autowired
  ProdukService produkService;

  @GetMapping
  public String index() {
    return "home";
  }

  @GetMapping("pesanan")
  public String pesanan() {
    return "pesanan";
  }

  @GetMapping("produk")
  public String produk(Model model) {
    model.addAttribute("allProduk", produkService.allProduk());
    return "produk";
  }

}
