package citytech.sharif.rusthelp;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;
        import android.widget.Toast;

public class Tiers extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiers);

        String[] tiers = {"Tier 0-Twig|50 Wood| 5HP.", "Tier 1-Wood|200 Wood| 250HP ", "Tier 2-Stone| 300 Stone|500HP"
                , "Tier 3-Sheet Metal|150 Metal Fragments|200HP and needs a C4 to destroy.",
                "Tier 4-Armored Plate|1000hp and needs two C4 to destroy."};
        ListAdapter tierAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tiers);
        ListView tierListView = (ListView) findViewById(R.id.tiersBuilding);
        tierListView.setAdapter(tierAdapter);

        tierListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Tiers.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}