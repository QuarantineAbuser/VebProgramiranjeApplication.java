package mk.ukim.finki.vebprogramiranje.bootstrap;

import mk.ukim.finki.vebprogramiranje.model.Category;
import mk.ukim.finki.vebprogramiranje.model.Manufacturer;
import mk.ukim.finki.vebprogramiranje.model.Product;
import mk.ukim.finki.vebprogramiranje.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init(){
        categories.add(new Category("Books", "Books category"));
        categories.add(new Category("Movies","Movies category"));
        categories.add(new Category("Games","Gaming category"));

        users.add(new User("stefanmitrevski","sm", "Stefan", "Mitrevski"));
        users.add(new User("viktoraleksoski","va", "Viktor", "Aleksoski"));

        Manufacturer manufacturer = new Manufacturer("Nike", "NY NY");
        manufacturers.add(manufacturer);

        Category category = new Category("Sports","Sports category");
        categories.add(category);

        products.add(new Product("Ball 1",255.5, 7, category, manufacturer));
        products.add(new Product("Ball 2",255.5, 7, category, manufacturer));
        products.add(new Product("Ball 3",255.5, 7, category, manufacturer));

    }
}
