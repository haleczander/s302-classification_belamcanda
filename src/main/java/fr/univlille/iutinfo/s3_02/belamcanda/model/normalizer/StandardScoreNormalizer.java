package fr.univlille.iutinfo.s3_02.belamcanda.model.normalizer;

public class StandardScoreNormalizer implements IValueNormalizer {
    @Override
    public double normalize(Object value, Amplitude amplitude) {
        Double v = ((Number) value).doubleValue();
        return (v - amplitude.getAverage()) / amplitude.getStandardDeviation();
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public boolean needAmplitude() {
        return true;
    }
}