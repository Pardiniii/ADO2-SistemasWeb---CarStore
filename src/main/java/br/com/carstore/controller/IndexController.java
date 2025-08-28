package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/api/carros")
public class IndexController {
    @PostMapping
    public Map<String, String> criar (@RequestParam String nome,
                                      @RequestParam String cor){
        return Map.of("nome",nome,"cor",cor);
    }
}
