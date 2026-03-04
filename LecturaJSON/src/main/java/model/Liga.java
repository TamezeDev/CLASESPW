package model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Liga implements Serializable {
    //Siempre mismos nombre que el JSON para trabajar con GSON
    private String idLeague;
    private String strLeague;
    private String strSport;
    private static long serialVersionUID = 1L;

}
