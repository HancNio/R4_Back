/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retocuatro_web.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import retocuatro_web.modelo.User;

/**
 *
 * @author hanc9
 */
public interface UserInterface extends MongoRepository<User, Integer>{
    
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword (String email, String password);
    Optional<User> findTopByOrderByIdDesc();
}
