package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.CascadeType;

import java.time.LocalDate;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(generator = "product_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "product_gen", sequenceName = "product_seq", allocationSize = 1)
    private Long id;
    @Column(name = "product_name")
    private String productName;
    private int price;
    @Column(name = "year_of_issue")
    private LocalDate yearOfIssue;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private Company company;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private Category category;

    public Product(String productName, int price, LocalDate yearOfIssue) {
        this.productName = productName;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
    }

    public Product(String productName, int price, LocalDate yearOfIssue, Company company, Category category) {
        this.productName = productName;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
        this.company = company;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
