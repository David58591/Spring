package com.everis.formacion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.everis.formacion.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping()
    public String inicio(Model model){
        var mensaje = "Saludos desde con Thymeleaf";
       Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@gmail.com");
        persona.setTelefono("12224587");
        
       Persona persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("cgomez@gmail.com");
        persona2.setTelefono("12278587");
       
        var personas = Arrays.asList(persona,persona2);
        log.info("ejecutando el controlador rest");
        
        model.addAttribute("personas", personas);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        return "index";
    }
}
