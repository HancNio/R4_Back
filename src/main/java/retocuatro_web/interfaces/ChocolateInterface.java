/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retocuatro_web.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import retocuatro_web.modelo.Chocolate;

/**
 *
 * @author hanc9
 */
public interface ChocolateInterface extends MongoRepository<Chocolate, String>{
    
}
