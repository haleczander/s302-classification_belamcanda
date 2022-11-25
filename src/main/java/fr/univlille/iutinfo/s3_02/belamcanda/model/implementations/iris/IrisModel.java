package fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.iris;

import fr.univlille.iutinfo.s3_02.belamcanda.model.Column;
import fr.univlille.iutinfo.s3_02.belamcanda.model.MVCModel;
import fr.univlille.iutinfo.s3_02.belamcanda.model.NormalizableColumn;
import fr.univlille.iutinfo.s3_02.belamcanda.model.Point;
import fr.univlille.iutinfo.s3_02.belamcanda.model.colonnes_enum.IColumnDefinition;
import fr.univlille.iutinfo.s3_02.belamcanda.model.loader.CSVModel;

public class IrisModel extends MVCModel {
	protected IrisModel() {
		super(IrisPoint.class);
	}

	@Override
	public String getTitle() {
		return "Iris";
	}

	@Override
	public Column[] getColumns() {
		return IColumnDefinition.getColumns(IrisColumns.values());
	}

	@Override
	public NormalizableColumn defaultXCol() {
		return (NormalizableColumn)IrisColumns.PETAL_LENGTH.getColumn();
	}

	@Override
	public NormalizableColumn defaultYCol() {
		return (NormalizableColumn)IrisColumns.PETAL_WIDTH.getColumn();
	}

	@Override
	protected CSVModel getCSVModel() {
		return CSVModel.IRIS;
	}
}
