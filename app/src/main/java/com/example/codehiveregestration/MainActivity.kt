package com.example.codehiveregestration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //This is called casting our views.
        var etName = findViewById<EditText>(R.id.etName)
        var etDob = findViewById<EditText>(R.id.etDOB)
        var etNationality = findViewById<EditText>(R.id.etNationality)
        var etIdNo =findViewById<EditText>(R.id.etIDNo)
        var etEmail = findViewById<EditText>(R.id.etEmail)
        var etPhoneNumber = findViewById<EditText>(R.id.etPhoneNumber)
        var btnRegester = findViewById<Button>(R.id.btnRegester)

        btnRegester.setOnClickListener {
            var name = etName.text.toString()
            var dob = etDob.text.toString()
            var  nationality = etNationality.text.toString()
            var idNo = etIdNo.text.toString()
            var email = etEmail.text.toString()
            var phoneNumber =etPhoneNumber.text.toString()

            var details = Details(name=name, dob=dob, nationality=nationality, idNo=idNo, email=email, phoneNumber=phoneNumber)
            Toast.makeText(baseContext, name, Toast.LENGTH_LONG).show()
        }
    }
}
data class Details(
      var name:String,
      var dob: String,
      var nationality:String,
      var idNo:String,
      var email:String,
      var phoneNumber:String
)