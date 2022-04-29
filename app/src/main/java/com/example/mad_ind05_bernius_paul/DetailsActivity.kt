package com.example.mad_ind05_bernius_paul

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)

        // Create constant variables and assign them to the components on the details screen
        val stateFlag : ImageView = findViewById(R.id.stateFlagImage)
        val stateMap : ImageView = findViewById(R.id.stateMapImage)
        val stateName : TextView = findViewById(R.id.stateNameText)
        val stateSqMiles : TextView = findViewById(R.id.stateSqMilesText)

        val bundle : Bundle? = intent.extras // Get bundle sent from MainActivity
        val flag = bundle!!.getInt("flag") // Assign flag to image sent from MainActivity with key flag
        val map = bundle.getInt("map") // Assign map to image sent from MainActivity with key map
        val name = bundle.getString("name") // Assign name to string sent from MainActivity with key name
        val sqMiles = bundle.getString("sqmiles") + " sq. Miles" // Assign sqMiles to string sent from MainActivity with key sqmiles and concat 'sq. Miles' to it

        // Set components text/source to created values
        stateFlag.setImageResource(flag)
        stateMap.setImageResource(map)
        stateName.text = name
        stateSqMiles.text = sqMiles
    }


}