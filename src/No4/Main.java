package No4;

public class Main {
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        System.out.printf("Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f, dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.2f%n",
                limas1.getLuasAlas(), limas1.getLuasSelubung(), limas1.getTinggi(), limas1.getLuas(), limas1.getVolume());

        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
        System.out.printf("Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f, dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.2f%n",
                limas2.getLuasAlas(), limas2.getLuasSelubung(), limas2.getTinggi(), limas2.getLuas(), limas2.getVolume());

        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 35.0, 45.0);
        System.out.printf("Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f, dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.2f%n",
                limas3.getLuasAlas(), limas3.getLuasSelubung(), limas3.getTinggi(), limas3.getLuas(), limas3.getVolume());
    }
}
