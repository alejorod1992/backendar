package com.portfolio.alejor.Interface;

import com.portfolio.alejor.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
   //Get
    public List<Persona> getPersona();
   //post
    public void savePersona(Persona persona);
    //delete
    public void deletePersona(Long id);
    //find
    public Persona findPersona(Long id);

}