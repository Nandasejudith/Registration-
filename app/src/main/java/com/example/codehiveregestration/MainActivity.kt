package com.example.codehiveregestration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etDob: EditText
    lateinit var etIdNo: EditText
    lateinit var etPhoneNumber: EditText
    lateinit var etEmail: EditText
    lateinit var btnRegister: Button
    lateinit var spNationality:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        buttonListener()

        //This is called casting our views.
       etName = findViewById<EditText>(R.id.etName)
       etDob = findViewById<EditText>(R.id.etDoB)
       etIdNo =findViewById<EditText>(R.id.etEmail)
       etEmail = findViewById<EditText>(R.id.spNationality)
       etPhoneNumber = findViewById<EditText>(R.id.etPhoneNumber)
       btnRegister = findViewById<Button>(R.id.btnRegister)

       btnRegister.setOnClickListener{

        var name = etName.text.toString()
        if (name =etName)
        var dob = etDob.text.toString()
        var nationality = spNationality.selectedItem.toString()
        var idNo = etIdNo.text.toString()
        var email = etEmail.text.toString()
        var phoneNumber = etPhoneNumber.text.toString()
           if (email.isEmpty()){
               error=true
               etEmail.setError("Email is required")
           }
    }

            var details = Details(name=name, dob=dob, nationality=nationality, idNo=idNo, email=email, phoneNumber=phoneNumber)
           Toast.makeText(baseContext, name, Toast.LENGTH_LONG).show()
        }
   }
    fun castViews() {
        etName = findViewById<EditText>(R.id.etName)
        spNationality = findViewById(R.id.spNationality)

        val nationalities = arrayOf("Ugandans", "Kenyans", "Rwandan", "South Sudanese")
//        var nationalityAdapter =ArrayAdapter<String>(,android.R.layout.simple_spinner_item)
        var nationalityAdapter = ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_dropdown_item, nationalities)
        nationalityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spNationality.adapter = nationalityAdapter
  }

var registrationRequest =  RegistrationRequest(
    name=name, phoneNumber=phoneNumber, email=email, nationality=nationality,dateOf Birth=dob,
    password=password
)

//data class Details(
//      var name:String,
//      var dob: String,
//      var nationality:String,
//      var idNo:String,
//      var email:String,
//      var phoneNumber:String
//)