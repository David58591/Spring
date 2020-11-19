package com.everis.formacion.web;

import lombok.extern.slf4j.Slf4j;
import com.everis.formacion.dao.PersonaDao;
import com.everis.formacion.domain.Persona;
import com.everis.formacion.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        Iterable<Persona> personas = personaService.listarPersonas();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
