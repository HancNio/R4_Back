package retocuatro_web;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import retocuatro_web.interfaces.ChocolateInterface;
import retocuatro_web.interfaces.OrderCrudRepository;
import retocuatro_web.interfaces.UserInterface;

@Component
@SpringBootApplication
public class RetodosWebApplication implements CommandLineRunner {

    @Autowired
    private ChocolateInterface interfaceChocolate;

    @Autowired
    private UserInterface interfaceUser;
    
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(RetodosWebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll();
        orderCrudRepository.deleteAll();

    }
}
