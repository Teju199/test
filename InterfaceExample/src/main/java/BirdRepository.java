import java.util.ArrayList;
import java.util.List;

public class BirdRepository {
    private List birdList = new ArrayList();
     void add(Parrot parrot){
        birdList.add(parrot);
    }

    void add(Penguin penguin){
        birdList.add(penguin);
    }

    void add(Duck duck){
        birdList.add(duck);
    }
}
