package org.example.hellospringdatajpa.controller;

import java.util.List;
import lombok.Getter;
import org.example.hellospringdatajpa.entity.Product;
import org.example.hellospringdatajpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping({"", "/"})
    public String viewHome(Model model) {

        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);

        return "index";
    }

    @GetMapping("/new")
    public String newProduct(Model model) {

        model.addAttribute("product", new Product());

        return "newProduct";
    }

    @GetMapping("/edit/{id}")
    public String showEditProductPage(@PathVariable(name = "id") Long id, Model model) {

        Product product = productService.getProductById(id);
        model.addAttribute("product", product);

        return "editProduct";
    }

    @PostMapping("/save")
    public String saveProduct(Product product) {

        productService.saveProduct(product);

        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id) {

        productService.deleteProduct(id);

        return "redirect:/products";
    }
}
