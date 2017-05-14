package xyz.bnayagrawal.android.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.*;
import java.util.List;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //invokes when the user presses the find beer button
    public void onClickFindBeer(View view) {
        //get the references to the gui components
        TextView brands = (TextView)findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);

        //get and display the selected item from the spinner
        //brands.setText(color.getSelectedItem().toString());

        //use custom java class to recommend beer
        String recommendations = "";
        List<String> beers = (new BeerExpert()).getBrands(color.getSelectedItem().toString());
        for(String brand : beers)
            recommendations += brand + '\n';

        brands.setText(recommendations);
    }
}
