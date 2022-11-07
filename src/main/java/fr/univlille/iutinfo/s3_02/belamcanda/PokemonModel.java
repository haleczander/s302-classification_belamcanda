package fr.univlille.iutinfo.s3_02.belamcanda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class PokemonModel implements IMVCModel {

	IDataset data;
	
	public PokemonModel() {
		// TODO: Créer un dataset
	}
	
	@Override
	public void loadFromFile(String datafile) {
		List<Pokemon> list;
		try {
			list = new CsvToBeanBuilder<Pokemon>(Files.newBufferedReader(Paths.get(datafile)))
			        .withSeparator(',')
			        .withType(Pokemon.class)
			        .build().parse();
			System.out.println(list);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void loadFromString(String data) {
		
	}

	@Override
	public IColumn defaultXCol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColumn defaultYCol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCategory(ICategory classe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<ICategory> allCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nbColumns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IColumn> getNormalizableColumns() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		PokemonModel model = new PokemonModel();
		String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "pokemon_train.csv";
		model.loadFromFile(path);
	}
}