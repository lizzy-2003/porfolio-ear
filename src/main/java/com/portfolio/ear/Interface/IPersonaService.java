package com.portfolio.ear.Interface;

import com.portfolio.ear.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);

    //Traer una lista de Personas
    public List<Persona> getPersona(); 
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
