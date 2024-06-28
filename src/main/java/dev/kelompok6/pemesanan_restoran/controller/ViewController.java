package dev.kelompok6.pemesanan_restoran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ViewController {

  @GetMapping
  public String index() {
    return "home";
  }

  @GetMapping("pesanan")
  public String pesanan() {
    return "pesanan";
  }

  @GetMapping("produk")
  public String produk() {
    return "produk";
  }

}
