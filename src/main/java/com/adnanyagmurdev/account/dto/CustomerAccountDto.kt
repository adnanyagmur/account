package com.adnanyagmurdev.account.dto

import java.math.BigDecimal
import java.time.LocalDateTime

class CustomerAccountDto (
    val id: String,
    val balance: BigDecimal? = BigDecimal.ZERO,
    val transaction: Set<TransactionDto>?,
    val creationDate: LocalDateTime
        )