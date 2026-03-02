package model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Libro {

    @XmlAttribute
    private int anio;
    @XmlAttribute
    private int nPaginas;
    @XmlAttribute
    private int isbn;

    private String titulo;
    private String escritor;
    private String categoria;

    @XmlElement(name = "personaje")
    private List<Personaje> personajes;

    public Libro() {
        personajes = new ArrayList<>();
    }

    public Libro(int anio, int nPaginas, int isbn, String titulo, String escritor, String categoria) {
        this.anio = anio;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
        this.titulo = titulo;
        this.escritor = escritor;
        this.categoria = categoria;
        personajes = new ArrayList<>();
    }
}
