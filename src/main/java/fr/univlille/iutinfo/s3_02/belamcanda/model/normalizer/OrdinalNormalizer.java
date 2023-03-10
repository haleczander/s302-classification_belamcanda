package fr.univlille.iutinfo.s3_02.belamcanda.model.normalizer;

import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes.comparator.ColumnComparator;
import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes.comparator.DrasticComparator;

public class OrdinalNormalizer<T extends Enum> implements IValueNormalizer {
    @Override
    public double normalize(Object value, Amplitude amplitude) {
        T type = (T) value;
        Class<? extends Enum> clazz = type.getClass();
        return (type.ordinal() * 1.0) / (clazz.getEnumConstants().length - 1);
    }


    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public boolean needAmplitude() {
        return false;
    }

    @Override
    public ColumnComparator getComparator() {
        return new DrasticComparator();
    }
}
