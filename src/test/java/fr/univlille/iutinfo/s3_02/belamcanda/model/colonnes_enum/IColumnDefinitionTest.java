package fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes_enum;

import fr.univlille.iutinfo.s3_02.belamcanda.model.Column;
import fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.pokemon.PokemonColumns;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IColumnDefinitionTest {
    // TODO IMPLEMENTER LES NORMALISEURS AVANT DE PASSER LES TEST

    @Test
    public void column_attributes_should_be_singletons(){
        IColumnDefinition[] columnDefinitions = PokemonColumns.values();
        ArrayList<Column> columns = new ArrayList<>();

        for (IColumnDefinition col : columnDefinitions) {
            columns.add(col.getColumn());
        }

        int i =0;
        for (Column col : columns){
            assertEquals(col, PokemonColumns.values()[i++].getColumn());
        }
    }

    @Test
    public void getting_columns_from_enum_list_should_return_column_list(){
        IColumnDefinition[] definitions = new IColumnDefinition[]{PokemonColumns.HP, PokemonColumns.ATTACK};
        assertArrayEquals(new Column[]{PokemonColumns.HP.getColumn(), PokemonColumns.ATTACK.getColumn()}, IColumnDefinition.getColumns(definitions));
    }

    /** Besoin fonctionnel : appel deux fois : deux fois les mêmes réponses
     * singleton c'est technique
     * on teste pour avoir toujours les memes données
     * on a utilisé singloton pour que les données ne soient pas a endroits en meme temps
     */
}