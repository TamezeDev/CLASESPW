package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@XmlRootElement(name = "Libreria")
public class Libreria {
    @XmlElement(name = "libro")
    private List<Libro> books;

    public Libreria() {
        books = new ArrayList<>();
    }

    public List<Libro> getBooks() {
        return books;
    }
}

