package com.portfolio.ear.Controller;

import com.portfolio.ear.Entity.Persona;
import com.portfolio.ear.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaservice;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return ipersonaservice.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaservice.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaservice.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    //URL:PUERTO/personas/editar/4?nombre=valor&apellido=valor&img=valor
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg,
            @RequestParam("descripcion") String nuevoDescripcion) {
        Persona persona = ipersonaservice.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setDescripcion(nuevoDescripcion);

        ipersonaservice.savePersona(persona);
        return persona;
    }
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        //return ipersonaservice.findPersona(Long.valueOf(1));
        return ipersonaservice.findPersona((long)1);
    }

}
