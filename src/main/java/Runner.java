import models.Golfer;
import db.DBGolfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Woods", 42);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Phil", "Mickelson", 48);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Justin", "Rose", 37);
        DBGolfer.save(golfer3);

        Golfer golfer4 = new Golfer("Rory", "McIlroy", 29);
        DBGolfer.save(golfer4);

        List<Golfer> golfers = DBGolfer.getAll();

        Golfer tiger = DBGolfer.find(golfer1.getId());
        System.out.println(tiger.getFirstName());

    }

}
