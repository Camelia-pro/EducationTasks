package fabrics;

import models.cars.IJeep;
import models.cars.ISedan;

import java.util.ArrayList;
import java.util.List;

public interface ICarFabric {
    ISedan createSedan();

    IJeep createJeep();

    default List<IJeep> createJeepSeries(int count) {
        List<IJeep> jeeps = new ArrayList<>();
        while (count-- > 0) {
            jeeps.add(createJeep());
        }
        return jeeps;
    }

    default List<ISedan> createSedanSeries(int count) {
        List<ISedan> sedans = new ArrayList<>();
        while (count-- > 0) {
            sedans.add(createSedan());
        }
        return sedans;
    }
}
