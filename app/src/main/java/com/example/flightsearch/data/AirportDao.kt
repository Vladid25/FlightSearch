package com.example.flightsearch.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface AirportDao {
    @Query(
        """
            SELECT * FROM airport
            Where name LIKE :enteredName or iata_code Like :enteredName
        """
    )
    fun getAirportsByName(enteredName:String)
}