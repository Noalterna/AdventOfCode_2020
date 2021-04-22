import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class Task1Test {

    @Test
    void canFind2Numbers2020andMultiply() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1721, 979, 366, 299, 675, 1456));
        Task1 task1 = new Task1();
        int result = task1.find2Numbers2020AndMultiply(list);

        Assertions.assertEquals(514579, result);
    }

    @Test
    void canfind3Numbers2020andMultiply() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1721, 979, 366, 299, 675, 1456));
        Task1 task1 = new Task1();
        int result = task1.find3Numbers2020andMultiply(list);

        Assertions.assertEquals(241861950, result);
    }
}