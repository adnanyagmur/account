package com.adnanyagmurdev.account.dto

import com.adnanyagmurdev.account.model.Customer
import com.adnanyagmurdev.account.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto (
        val id: String?,
        val balance: BigDecimal?,
        val creationDate: LocalDateTime,
        val customer: AccountCustomerDto?,
        val transaction: Set<TransactionDto>?
        )