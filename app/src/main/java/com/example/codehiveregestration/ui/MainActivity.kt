package com.example.codehiveregestration.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.activity.viewModels
import com.example.codehiveregestration.databinding.ActivityMainBinding
import com.example.codehiveregestration.models.RegistrationRequest
import com.example.codehiveregestration.registrationResponse
import com.example.codehiveregestration.viewmodel.UserViewModel
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
//    lateinit var etName: EditText
//    lateinit var etDob: EditText
//    lateinit var etIdNo: EditText
//    lateinit var etPhoneNumber: EditText
//    lateinit var etEmail: EditText
//    lateinit var btnRegister: Button
//    lateinit var spNationality:Spinner
      lateinit var binding: ActivityMainBinding
      val  userViewModel:UserViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }

    override fun onResume() {
        super.onResume()
        binding.btnRegister.setOnClickListener {
            registerStudent()
        }
   }
   fun registerStudent (){
        var name = binding.etName.toString()
        var email = binding.etEmail.toString()
       var dateOfBirth = binding.etDoB.text.toString()
       var phoneNumber = binding.etPhoneNumber.toString()
       var nationality = binding.spNationality.toString()
//       var password = binding.etpassword.text.toString()


var registrationRequest =  RegistrationRequest(
    name=name,
    phoneNumber=phoneNumber,
    email=email,
    nationality=nationality,
    dateOfBirth=dateOfBirth,
//    password=password
)
        userViewModel.registration(registrationRequest)
        userViewModel.registrationFailedData.observe(this,{ registrationRequest->
    if(! registrationResponse.studentId.isNullorEmpty()){
        Toast.makeText(baseContext, "Registration Successful", Toast.LENGTH_LONG).show()
    }
        })

        userViewModel.registrationFailedData.observe(this, { error->
          Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()
        })

        }
 }