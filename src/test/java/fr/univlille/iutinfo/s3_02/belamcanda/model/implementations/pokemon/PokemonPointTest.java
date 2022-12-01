package fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.pokemon;

import fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.titanic.TitanicPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonPointTest {
    @Test
    void the_name_of_label_is_correct(){
        PokemonPoint point1 = new PokemonPoint();
        point1.name = "grotadmorv";
        point1.attack = 10;
        point1.defense = 10;
        point1.hp = 10;
        String test = String.format("%s :\n\tatk : %d\n\tdef : %d\n\thp  : %d",point1.name.toUpperCase(), point1.attack, point1.defense, point1.hp);
        assertEquals(test, point1.toLabel());
    }
}
