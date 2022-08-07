package com.example.owe_you_i_do.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.owe_you_i_do.transaction.Transaction

@Dao
interface TransactionDAO {

    @Insert
    suspend fun insertTransaction(transaction: Transaction): Long

    @Update
    suspend fun updateTransaction(transaction: Transaction)

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    @Query("DELETE FROM transaction_data_table")
    suspend fun deleteAllTransactions()

    @Query("SELECT * FROM transaction_data_table")
    fun getAllTransaction(): LiveData<List<Transaction>>
}
