package com.example.databaseintegration.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.databaseintegration.modeldata.DetailSiswa
import com.example.databaseintegration.modeldata.UIStateSiswa
import com.example.databaseintegration.modeldata.toDataSiswa
import com.example.databaseintegration.modeldata.toUIStateSiswa
import com.example.databaseintegration.repositori.RepositoryDataSiswa
import com.example.databaseintegration.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import retrofit2.Response

class EditViewModel( savedStateHandle: SavedStateHandle,private val repositoryDataSiswa: RepositoryDataSiswa
) : ViewModel() {

}