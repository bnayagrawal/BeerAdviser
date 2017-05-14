package xyz.bnayagrawal.android.beeradviser;

/**
 * Created by binay on 14/5/17.
 */
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber")) {
            brands.add("Jack amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
