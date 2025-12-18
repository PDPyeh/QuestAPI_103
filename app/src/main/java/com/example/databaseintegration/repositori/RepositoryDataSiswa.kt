package com.example.databaseintegration.repositori

import com.example.databaseintegration.modeldata.DataSiswa

interface RepositoryDataSiswa{
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa:DataSiswa) :retrofit2.Response<Void>

    //suspend fun getStatusSiswa(id:Int) : DataSiswa
    //suspend fun editStatusSiswa(id:Int,dataSiswa: DataSiswa):retrofit2.Response<Void>
    //suspend fun hapusStatusSiswa(id:Int):retrofit2.Response<Void>
}