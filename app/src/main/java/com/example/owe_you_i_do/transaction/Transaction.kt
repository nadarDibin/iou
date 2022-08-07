package com.example.owe_you_i_do.transaction

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transaction_data_table")
data class Transaction(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "transaction_id")
    val id: Int,

    @ColumnInfo(name = "transaction_title")
    val title: String,

    @ColumnInfo(name = "transaction_description")
    val description: String,

    @ColumnInfo(name = "transaction_date")
    val date: Date,

    @ColumnInfo(name = "transaction_total_amount")
    val totalAmount: Date,

    @ColumnInfo(name = "transaction_owed_amount")
    val owedAmount: Date,
)
