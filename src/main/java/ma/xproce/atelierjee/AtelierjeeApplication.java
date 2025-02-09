package ma.xproce.atelierjee;

import ma.xproce.atelierjee.doa.entities.Video;
import ma.xproce.atelierjee.doa.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtelierjeeApplication {
    @Autowired
    private VideoRepository videoRepository;

    public static void main(String[] args) {
        SpringApplication.run(AtelierjeeApplication.class, args);
    }


}
