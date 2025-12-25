package com.example.databaseintegration.repositori

import com.example.databaseintegration.apiservice.ServiceApiSiswa
import com.example.databaseintegration.modeldata.DataSiswa

interface RepositoryDataSiswa{
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa:DataSiswa) :retrofit2.Response<Void>

    suspend fun getSatuSiswa(id:Int) : DataSiswa
    suspend fun editSatuSiswa(id:Int,dataSiswa: DataSiswa):retrofit2.Response<Void>
    suspend fun hapusSatuSiswa(id:Int):retrofit2.Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa : ServiceApiSiswa
):RepositoryDataSiswa{
    override suspend fun getDataSiswa() : List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
    override suspend fun getSatuSiswa(id: Int): DataSiswa - serviceApiSiswa.getSatuSiswa()
    override suspend fun ediSatuSiswa(id: Int,dataSiswa :DataSiswa):retrofit2.Response<Void> = serviceApiSiswa.editSiswa(id,dataSiswa)
    override suspend fun hapusSatuSiswa(id: Int):retrofit2.Response<Void> = serviceApiSiswa.hapusSatuSiswa(id)
}