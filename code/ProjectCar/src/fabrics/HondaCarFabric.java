package fabrics;

import models.cars.Honda.HondaJeep;
import models.cars.Honda.HondaSedan;
import models.cars.IJeep;
import models.cars.ISedan;

public class HondaCarFabric extends ACarFabric {
    @Override
    public IJeep createJeep(){return new HondaJeep(this.getCarColor());}
    @Override
    public ISedan createSedan() {
        return new HondaSedan(this.getCarColor());
    }
}
