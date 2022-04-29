package com.example.mad_ind05_bernius_paul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), MyAdapter.OnItemClickListener {

    // Create variables
    private lateinit var newAdapter : MyAdapter
    private lateinit var newRecyclerView : RecyclerView
    private lateinit var stateData: ArrayList<States>
    private lateinit var sqMiles : Array<String>
    private lateinit var stateFlags : Array<Int>
    private lateinit var stateMaps : Array<Int>
    private lateinit var title : ArrayList<String>
    private lateinit var subtitle : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add Square Mile data
        sqMiles = arrayOf(
            "50,744",
            "571,951",
            "113,635",
            "52,068",
            "155,959",
            "103,718",
            "4,845",
            "1,954",
            "53,927",
            "57,906",
            "6,423",
            "82,747",
            "55,584",
            "35,867",
            "55,869",
            "81,815",
            "39,728",
            "43,562",
            "30,862",
            "9,774",
            "7,840",
            "56,804",
            "79,610",
            "46,907",
            "68,886",
            "145,552",
            "76,872",
            "109,826",
            "8,968",
            "7,417",
            "121,356",
            "47,214",
            "48,711",
            "68,976",
            "40,948",
            "68,667",
            "95,997",
            "44,817",
            "1,045",
            "30,109",
            "75,885",
            "41,217",
            "261,797",
            "82,144",
            "9,250",
            "39,594",
            "66,544",
            "24,078",
            "54,310",
            "97,100"
        )

        // Add state .pngs to an array from drawable
        stateFlags = arrayOf(
            R.drawable.alabamaflag,
            R.drawable.alaskaflag,
            R.drawable.arizonaflag,
            R.drawable.arkansasflag,
            R.drawable.californiaflag,
            R.drawable.coloradoflag,
            R.drawable.connecticutflag,
            R.drawable.delawareflag,
            R.drawable.floridaflag,
            R.drawable.georgiaflag,
            R.drawable.hawaiiflag,
            R.drawable.idahoflag,
            R.drawable.illinoisflag,
            R.drawable.indianaflag,
            R.drawable.iowaflag,
            R.drawable.kansasflag,
            R.drawable.kentuckyflag,
            R.drawable.louisianaflag,
            R.drawable.maineflag,
            R.drawable.marylandflag,
            R.drawable.massachusettsflag,
            R.drawable.michiganflag,
            R.drawable.minnesotaflag,
            R.drawable.mississippiflag,
            R.drawable.missouriflag,
            R.drawable.montanaflag,
            R.drawable.nebraskaflag,
            R.drawable.nevadaflag,
            R.drawable.newhampshireflag,
            R.drawable.newjerseyflag,
            R.drawable.newmexicoflag,
            R.drawable.newyorkflag,
            R.drawable.northcarolinaflag,
            R.drawable.northdakotaflag,
            R.drawable.ohioflag,
            R.drawable.oklahomaflag,
            R.drawable.oregonflag,
            R.drawable.pennsylvaniaflag,
            R.drawable.rhodeislandflag,
            R.drawable.southcarolinaflag,
            R.drawable.southdakotaflag,
            R.drawable.tennesseeflag,
            R.drawable.texasflag,
            R.drawable.utahflag,
            R.drawable.vermontflag,
            R.drawable.virginiaflag,
            R.drawable.washingtonflag,
            R.drawable.westvirginiaflag,
            R.drawable.wisconsinflag,
            R.drawable.wyomingflag
        )

        // Add maps .pngs to an array from drawable
        stateMaps = arrayOf(
            R.drawable.alabamamap,
            R.drawable.alaskamap,
            R.drawable.arizonamap,
            R.drawable.arkansasmap,
            R.drawable.californiamap,
            R.drawable.coloradomap,
            R.drawable.connecticutmap,
            R.drawable.delawaremap,
            R.drawable.floridamap,
            R.drawable.georgiamap,
            R.drawable.hawaiimap,
            R.drawable.idahomap,
            R.drawable.illinoismap,
            R.drawable.indianamap,
            R.drawable.iowamap,
            R.drawable.kansasmap,
            R.drawable.kentuckymap,
            R.drawable.louisianamap,
            R.drawable.mainemap,
            R.drawable.marylandmap,
            R.drawable.massachusettsmap,
            R.drawable.michiganmap,
            R.drawable.minnesotamap,
            R.drawable.mississippimap,
            R.drawable.missourimap,
            R.drawable.montanamap,
            R.drawable.nebraskamap,
            R.drawable.nevadamap,
            R.drawable.newhampshiremap,
            R.drawable.newjerseymap,
            R.drawable.newmexicomap,
            R.drawable.newyorkmap,
            R.drawable.northcarolinamap,
            R.drawable.northdakotamap,
            R.drawable.ohiomap,
            R.drawable.oklahomamap,
            R.drawable.oregonmap,
            R.drawable.pennsylvaniamap,
            R.drawable.rhodeislandmap,
            R.drawable.southcarolinamap,
            R.drawable.southdakotamap,
            R.drawable.tennesseemap,
            R.drawable.texasmap,
            R.drawable.utahmap,
            R.drawable.vermontmap,
            R.drawable.virginiamap,
            R.drawable.washingtonmap,
            R.drawable.westvirginiamap,
            R.drawable.wisconsinmap,
            R.drawable.wyomingmap
        )

        // Add state names to an array
        title = arrayListOf(
            "Alabama",
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming",
            "Wyoming"
        )

        // Add state nicknames to an array
        subtitle = arrayListOf(
            "The Yellowhammer State",
            "The Yellowhammer State",
            "The Last Frontier",
            "The Grand Canyon State",
            "The Natural State",
            "The Golden State",
            "The Centennial State",
            "The Constitution State",
            "The First State",
            "The Sunshine State",
            "The Peach State",
            "The Aloha State",
            "The Gem State",
            "Prairie State",
            "The Hoosier State",
            "The Hawkeye State",
            "The Sunflower State",
            "The Bluegrass State",
            "The Pelican State",
            "The Pine Tree State",
            "The Old Line State",
            "The Bay State",
            "The Great Lakes State",
            "The North Star State",
            "The Magnolia State",
            "The Show Me State",
            "The Treasure State",
            "The Cornhusker State",
            "The Silver State",
            "The Granite State",
            "The Garden State",
            "The Land of Enchantment",
            "The Empire State",
            "The Tar Heel State",
            "The Peace Garden State",
            "The Buckeye State",
            "The Sooner State",
            "The Beaver State",
            "The Keystone State",
            "The Ocean State",
            "The Palmetto State",
            "Mount Rushmore State",
            "The Volunteer State",
            "The Lone Star State",
            "The Beehive State",
            "The Green Mountain State",
            "The Old Dominion State",
            "The Evergreen State",
            "The Mountain State",
            "The Badger State",
            "The Equality or Cowboy State",
            "The Equality or Cowboy State"
        )

        newRecyclerView = findViewById(R.id.stateRecycler) // Assign the recycler to 'newRecyclerView'
        newRecyclerView.layoutManager = LinearLayoutManager(this) // Set recycler orientation
        newRecyclerView.setHasFixedSize(true)
        stateData = arrayListOf<States>()
        getUserData() // Call method to add elements to array of States
    }

    private fun getUserData() {
        // Add State elements to array & setup adapter
        for (i in title.indices) { // Cycler through title array
            val state = States(title[i], subtitle[i]) // Create State data object
            stateData.add(state) // Add data object to array
        }
        newAdapter = MyAdapter(stateData, this) // Call MyAdapter constructor with stateData array and this class listening to clicks
        newRecyclerView.adapter = newAdapter // Assign recycler's adapter to created adapter
    }

    override fun onItemClick(position: Int) {
        // Implement method from MyAdapter
        val intent = Intent(this@MainActivity, DetailsActivity::class.java) // Create intent
        intent.putExtra("flag", stateFlags[position - 1]) // Add state flag to key flag
        intent.putExtra("name", stateData[position].title) // Add state name to key name
        intent.putExtra("sqmiles", sqMiles[position - 1]) // Add state square miles to key sqmiles
        intent.putExtra("map", stateMaps[position - 1]) // Add state map to key map
        startActivity(intent) // Start DetailsActivity with created intent
    }
}