package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity{

    private String[][] doctor_details1 =
            {
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. Kunal Mittal", "Address : Gumanpura, Kota", "Exp : 11 Years", "Mobile no. :  083024 04415", "300"},
                    {"Doctor name : Dr. RP Sharma", "Address : Talwandi, Kota", "Exp : 46 Years", "Mobile no. : 094142 21320", "400"},
                    {"Doctor name : Dr. Brij Mohan", "Address : Adalat Road Nayapura", "Exp : 6 Years", "Mobile no. : 09035448200", "200"},
                    {"Doctor name : Dr. Jagdish Prasad Agarwal", "Address : Sudha General Hospital, Ummedpura Via Jagpura, NH-12, Jhalawar Road, Kota, Rajasthan 324003", "Exp : 27+ Years", "Mobile no. : 9414324567", "300"},
            };

    private String[][] doctor_details2 =
            {
                    {"Doctor name : Dirtician Harshita Bhargav", "432, near mittal hotel, Shastri Nagar, Dadabari, Kota, Rajasthan 324009", "Exp : 5 Years", "Mobile no. : 095710 19125", "300"},
                    {"Doctor name : Dr. Neelam Kahndelwal", "Address : Near Shyam Marble ShreeNathPuram", "Exp : 13 Years", "Mobile no. : 09035442890", "3000"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
            };

    private String[][] doctor_details3 =
            {
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
            };

    private String[][] doctor_details4 =
            {
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
            };

    private String[][] doctor_details5 =
            {
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
                    {"Doctor name : Dr. CP Vijay", "Address : 4, W-5, Sector - 4, Talwandi, Kota, Rajasthan 324005", "Exp : 5 Years", "Mobile no. : 094610 08983", "300"},
            };

    TextView tv;
    Button btn;
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    String[][] doctor_details = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0; i<doctor_details.length; i++){
            item = new HashMap<String,String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees:"+doctor_details[i][4]+"/-");
            list.add( item );
        }

        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );

        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent it  = new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class);
                it.putExtra("text1", title);
                it.putExtra("text2", doctor_details[i][0]);
                it.putExtra("text3", doctor_details[i][1]);
                it.putExtra("text4", doctor_details[i][3]);
                it.putExtra("text5", doctor_details[i][4]);
                startActivity(it);
            }
        });

    }
}