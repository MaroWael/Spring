import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("toyota")
    public Vehicle car() {
        return new Car();
    }

    @Bean("niggar")
    @Primary
    public Vehicle bike() {
        return new Bike();
    }

    @Bean("volvo")
    public Vehicle truck() {
        return new Truck();
    }
}
