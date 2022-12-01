package fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.pokemon;

import com.opencsv.bean.CsvBindByName;
import fr.univlille.iutinfo.s3_02.belamcanda.model.Point;
import fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.pokemon.qualitative_variables.Legendary;
import fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.pokemon.qualitative_variables.PokemonType;

import java.util.Objects;

public class PokemonPoint extends Point {
	@CsvBindByName(column = "name")
	public String name;
	@CsvBindByName(column = "attack")
	public int attack;
	@CsvBindByName(column = "base_egg_steps")
	public int baseEggSteps;
	@CsvBindByName(column = "capture_rate")
	public double captureRate;
	@CsvBindByName(column = "defense")
	public int defense;
	@CsvBindByName(column = "experience_growth")
	public int experienceGrowth;
	@CsvBindByName(column = "hp")
	public int hp;
	@CsvBindByName(column = "sp_attack")
	public int spAttack;
	@CsvBindByName(column = "sp_defense")
	public int spDefense;
	@CsvBindByName(column = "type1")
	public PokemonType pokemonType;
	@CsvBindByName(column = "type2")
	public PokemonType pokemonType2 = PokemonType.NONE;
	@CsvBindByName(column = "speed")
	public double speed;
	@CsvBindByName(column = "is_legendary")
	public Legendary isLegendary;

	@Override
	public Object category(){
		return isLegendary;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PokemonPoint that = (PokemonPoint) o;

		if (attack != that.attack) return false;
		if (baseEggSteps != that.baseEggSteps) return false;
		if (Double.compare(that.captureRate, captureRate) != 0) return false;
		if (defense != that.defense) return false;
		if (experienceGrowth != that.experienceGrowth) return false;
		if (hp != that.hp) return false;
		if (spAttack != that.spAttack) return false;
		if (spDefense != that.spDefense) return false;
		if (Double.compare(that.speed, speed) != 0) return false;
		if (!Objects.equals(name, that.name)) return false;
		if (pokemonType != that.pokemonType) return false;
		if (pokemonType2 != that.pokemonType2) return false;
		return isLegendary == that.isLegendary;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = name != null ? name.hashCode() : 0;
		result = 31 * result + attack;
		result = 31 * result + baseEggSteps;
		temp = Double.doubleToLongBits(captureRate);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + defense;
		result = 31 * result + experienceGrowth;
		result = 31 * result + hp;
		result = 31 * result + spAttack;
		result = 31 * result + spDefense;
		result = 31 * result + (pokemonType != null ? pokemonType.hashCode() : 0);
		result = 31 * result + (pokemonType2 != null ? pokemonType2.hashCode() : 0);
		temp = Double.doubleToLongBits(speed);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (isLegendary != null ? isLegendary.hashCode() : 0);
		return result;
	}
}
