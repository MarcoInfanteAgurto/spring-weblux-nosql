package pe.edu.vallegrande.app.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Data
@Document(collection = "product")

public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;
    private String stock;
    private String code;
    private String create;
    private String state;

}
