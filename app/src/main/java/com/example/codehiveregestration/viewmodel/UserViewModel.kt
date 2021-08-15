package com.example.codehiveregestration.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.codehiveregestration.models.RegistrationRequest
import com.example.codehiveregestration.models.RegistrationResponse
import com.example.registration.models.Login
import com.example.registration.models.RegistrationRequest
import com.example.repository.UserRepository
import com.example.coroutine.launch

class UserViewModel {
var refistrationLiveData= MutableLiveData <RegistrationResponse>()
var registrationFailedData = MutableLiveData <String>()
var userRespository = UserRepository()

fun registration(registrationRequest: RegistrationRequest){
    viewModelScope.launch {
        var response = userRepository.registerStudent(registrationRequest)
        if(response.isSuccessful){
            registrationLiveData.postValue(response.body)
        }
        else{
            val registrationFailedLiveData = null
            registrationFailedLiveData.postValue(response.errorBody()?.string())
        }
    }
}
}