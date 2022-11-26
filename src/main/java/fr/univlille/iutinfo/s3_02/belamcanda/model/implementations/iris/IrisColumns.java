package fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.iris;

import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes.Column;
import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes.ColumnFactory;
import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes.IColumnDefinition;
import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes.NormalizableColumn;
import fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.iris.qualitative_variables.IrisVariety;
import fr.univlille.iutinfo.s3_02.belamcanda.model.normalizer.OrdinalNormalizer;

public enum IrisColumns implements IColumnDefinition {
    SEPAL_LENGTH(ColumnFactory.numberColumn("sepalLength")),
    SEPAL_WIDTH(ColumnFactory.numberColumn("sepalWidth")),
    PETAL_LENGTH(ColumnFactory.numberColumn("petalLength")),
    PETAL_WIDTH(ColumnFactory.numberColumn("petalWidth")),
    VARIETY(new NormalizableColumn("variety", new OrdinalNormalizer<IrisVariety>()));

    final Column column;

    IrisColumns(Column column) {
        this.column = column;
    }

    @Override
    public Column getColumn() {
        return this.column;
    }


}

