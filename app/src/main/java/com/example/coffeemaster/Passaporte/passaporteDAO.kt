package com.example.coffeemaster.Passaporte

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy


@Dao
interface passaporteDAO {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun salva (vararg cafes: Cafes)
}