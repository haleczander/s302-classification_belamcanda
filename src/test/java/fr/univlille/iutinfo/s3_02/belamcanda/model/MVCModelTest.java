package fr.univlille.iutinfo.s3_02.belamcanda.model;

import fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.pokemon.PokemonPoint;
import fr.univlille.iutinfo.s3_02.belamcanda.model.loader.CSVLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MVCModelTest {

    private MVCModel model;

    @BeforeEach
    void initialization() throws IOException {
        final String DATAPATH = System.getProperty("user.dir") + File.separator + "data" + File.separator;
        model = new CSVLoader().createModelFromFile(DATAPATH + "pokemon_test.csv");
    }

    @Test
    void iterator_should_browse_all_the_elements_in_the_csv() {
        int i = 0;
        for (Point element: model) {
            i++;
        }
        assertEquals(i, model.getNbLines());
    }

    @Test
    void new_element_should_be_registered_when_added() {
        PokemonPoint newPokemon = new PokemonPoint();
        model.addLine(newPokemon);
        assertTrue(model.trainingData.contains(newPokemon));
    }

    @Test
    void new_elements_should_be_registered_when_added() {
        List<PokemonPoint> newPokemons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newPokemons.add(new PokemonPoint());
        }
        model.addAllLine(newPokemons);
        assertTrue(model.trainingData.containsAll(newPokemons));
    }

    @Test
    void datas_are_reset_when_setting_new_lines() {
        assertEquals(273, model.getNbLines());

        List<Point> lines = new ArrayList<>();
        lines.add(new PokemonPoint());
        model.setLines(lines);

        assertEquals(1, model.getNbLines());
    }
}