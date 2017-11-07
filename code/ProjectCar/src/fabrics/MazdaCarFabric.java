package fabrics;

import models.cars.IJeep;
import models.cars.ISedan;
import models.cars.Mazda.MazdaJeep;
import models.cars.Mazda.MazdaSedan;

public class MazdaCarFabric extends ACarFabric {
        @Override
        public IJeep createJeep(){return new MazdaJeep(this.getCarColor());}
        @Override
        public ISedan createSedan() {
            return new MazdaSedan(this.getCarColor());
        }
}
