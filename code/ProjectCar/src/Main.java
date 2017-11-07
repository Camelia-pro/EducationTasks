import fabrics.ACarFabric;
import fabrics.MazdaCarFabric;
import models.Color;
import models.cars.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ACarFabric fabric = new MazdaCarFabric();
        fabric.setCarColor(Color.White);
        fabric.setCarSeries(n);
        ICar car =fabric.createJeep();
        List<? extends ICar> cars =fabric.createJeepSeries(n);
            System.out.println(cars.toString());
    }
}