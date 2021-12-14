/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocuatro_web.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retocuatro_web.interfaces.ChocolateInterface;
import retocuatro_web.modelo.Chocolate;

/**
 *
 * @author hanc9
 */
@Repository
public class ChocolateRepositorio {
    
    @Autowired
    private ChocolateInterface repository;
    
        public List<Chocolate> getAll() {
        return repository.findAll();
    }
        
    public Optional<Chocolate> getClothe(String reference){
        return repository.findById(reference);
    }
    
    public Chocolate create(Chocolate clothe) {
        return repository.save(clothe);
    }

    public void update(Chocolate clothe) {
        repository.save(clothe);
    }
    
    public void delete(Chocolate clothe) {
        repository.delete(clothe);
    }    
}
