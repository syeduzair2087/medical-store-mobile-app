package medicalstore.project.com.onlinemedicalstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MedicineActivity extends AppCompatActivity {

    ListView lstMedicine;
    String Condition;
    ArrayAdapter MedicineAdapter;

    String[] Allergies = {"Xyzal", "Atarax", "Vistaril", "Acther", "Hyzine", "Zymine", "Aldex D", "Pyril D", "Aldex AN", "Doxytex", "Typohist"};
    String[] Asthma = {"Singulair", "Aerobid", "Dulera", "Atrovent", "Alvesco", "Decadron", "Kenalog-40", "Sterapred", "Breo Ellipta", "Medrol", "Rayos", "Solu-Medrol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        lstMedicine = (ListView)findViewById(R.id.lstMedicene);

        Condition = getIntent().getStringExtra("condition");

        switch(Condition)
        {
            case "Allergies":
                MedicineAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Allergies);
                lstMedicine.setAdapter(MedicineAdapter);
                break;

            case "Asthma":
                MedicineAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Asthma);
                lstMedicine.setAdapter(MedicineAdapter);
                break;
        }
    }
}
