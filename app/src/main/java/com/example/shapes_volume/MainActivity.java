package com.example.shapes_volume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     GridView gridView1;
     ArrayList<Shape> a2;

     CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView1 = findViewById(R.id.gridView);
        a2 = new ArrayList<>();
        Shape cone = new Shape("CONE", R.drawable.cone1);
        Shape cylinder = new Shape("CYLINDER", R.drawable.cylinder);
        Shape ellipsoid = new Shape("ELLIPSOID", R.drawable.ellipsoid1);
        Shape pyramid = new Shape("PYRAMID", R.drawable.pyramid);
        Shape rectangular_prism = new Shape("RECTANGULAR_PRISM", R.drawable.rectangular_prism1);
        Shape sphere = new Shape("SPHERE", R.drawable.sphere);
        Shape torus = new Shape("TORUS", R.drawable.torus);
        Shape cube = new Shape("CUBE", R.drawable.cube1);
        Shape hemisphere = new Shape("HEMISPHERE", R.drawable.hemisphere);
        a2.add(cone);
        a2.add(cylinder);
        a2.add(ellipsoid);
        a2.add(pyramid);
        a2.add(rectangular_prism);
        a2.add(sphere);
        a2.add(torus);
        a2.add(cube);
        a2.add(hemisphere);
        customAdapter = new CustomAdapter(a2, getApplicationContext());
        gridView1.setAdapter(customAdapter);
        gridView1.setNumColumns(2);

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Shape selectedShape = a2.get(position);

                // Determine which activity to launch based on the selected item
                switch (selectedShape.getShape_name()) {
                    case "SPHERE":
                        goToSphere();
                        break;
                    case "CONE":
                       // goToCone();
                        break;
                    case "CYLINDER":
                       // goToCylinder();
                        break;
                    // Add cases for other shapes as needed

                    default:
                        // Handle the case when an unknown item is clicked
                        break;
                }
            }
        });
    }

    public void goToSphere(){
        Intent intent = new Intent(this, Sphere_volume.class);
        startActivity(intent);
    }
}