package com.example.owe_you_i_do.transaction

import com.example.owe_you_i_do.db.TransactionDAO

class TransactionRepository(private val transactionDAO: TransactionDAO) {

    suspend fun insertTransaction(transaction: Transaction) =
        transactionDAO.insertTransaction(transaction)

    suspend fun updateTransaction(transaction: Transaction) =
        transactionDAO.updateTransaction(transaction)

    suspend fun deleteTransaction(transaction: Transaction) =
        transactionDAO.deleteTransaction(transaction)

    suspend fun deleteAllTransactions() =
        transactionDAO.deleteAllTransactions()

    fun getAllTransaction() =
        transactionDAO.getAllTransaction()
}
