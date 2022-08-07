package com.example.owe_you_i_do.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.owe_you_i_do.transaction.Transaction

@Database(entities = [Transaction::class], version = 1)
abstract class TransactionDatabase : RoomDatabase() {
    abstract val transactionDAO: TransactionDAO

    companion object {
        @Volatile
        private var INSTANCE: TransactionDatabase? = null
        fun getDatabase(context: Context): TransactionDatabase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    TransactionDatabase::class.java,
                    "transaction_data_database"
                ).build()
            }
            return instance
        }
    }
}
