package com.javiera.controladores;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas {

    
    private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
    private static HashMap<String, String[]> recetasConIngredientes = new HashMap<>();

    // con esto se llena el HashMap con datos de prueba
    public ControladorRecetas() {
        String[] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
        recetasConIngredientes.put("Pizza", pizza);
        
        String[] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
        recetasConIngredientes.put("Espagueti", espagueti);
        
        String[] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
        recetasConIngredientes.put("Lasaña", lasaña);
    }

    // ruta para listar recetas
    @GetMapping("/recetas")
    public String obtenerTodasLasRecetas(Model model) {
        System.out.println("¡SÍ, EL NAVEGADOR ESTÁ ENTRANDO AL CONTROLADOR! ✨");
        model.addAttribute("listaRecetas", listaRecetas);
        return "recetas";
    }

    // ruta para ver el detalle de una receta
    @GetMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable("nombre") String nombre, Model model) {
        
        // se buscan los ingredientes en el hashmap
        String[] ingredientes = recetasConIngredientes.get(nombre);
        
        model.addAttribute("nombreReceta", nombre);
        model.addAttribute("ingredientes", ingredientes); 
        
        return "detalleReceta";
    }
}