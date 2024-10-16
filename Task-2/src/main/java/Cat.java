import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Cat {

    public Cat() {

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
