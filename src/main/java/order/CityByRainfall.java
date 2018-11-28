package order;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/11/28  15:35
 */
import com.google.common.primitives.Doubles;

import java.util.Comparator;

public class CityByRainfall implements Comparator<City> {
    @Override
    public int compare(City city1, City city2) {
        return Doubles.compare(city1.getAverageRainfall(), city2.getAverageRainfall());
    }
}
