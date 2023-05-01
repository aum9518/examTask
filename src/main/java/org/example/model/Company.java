package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(generator = "company_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "company_gen",sequenceName = "company_seq",allocationSize = 1)
    private Long id;
    private String name;
    private String country;
    @OneToMany(mappedBy = "company",cascade = {CascadeType.ALL})
    private List<Product> products;

    public Company(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
              //  ", products=" + products +
                '}';
    }
}
