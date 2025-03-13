package it.epicode.team2;

import it.epicode.team1.Dipendente;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString

public class Dipartimento extends Dipendente {

    private String amministrazione;
    private String produzione;
    private String vendite;


}
