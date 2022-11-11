package fr.univlille.iutinfo.s3_02.belamcanda.beans;

import fr.univlille.iutinfo.s3_02.belamcanda.loader.PokemonLoader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BeanTest {
    final String DATA_PATH = System.getProperty("user.dir") + File.separator + "data" + File.separator ;

    @Test
    void getting_an_attribute_from_its_name_should_work() throws IOException, NoSuchFieldException, IllegalAccessException {
        String dataPath = DATA_PATH + "pokemon_test.csv";
        PokemonBean tropius = new PokemonLoader().loadFromFile(dataPath).get(0);
        assertEquals("Tropius", tropius.getValueFromString("name"));
    }
}