package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD) // para que autogenere el xml
public class Personaje {

    private String nombre;
    @XmlAttribute   // Le indica que este será un atributo
    private String tipo;
    @XmlAttribute
    private  boolean muerto;
}
