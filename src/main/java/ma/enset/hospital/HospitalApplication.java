package ma.enset.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class HospitalApplication extends CommandLineRunner  {

    public static void main(String[] args)  {
        SpringApplication.run(HospitalApplication.class, args);
    }

}
