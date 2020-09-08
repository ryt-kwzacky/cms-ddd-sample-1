package com.dddsample.demo.domain.userAccount

/**
 * オブジェクト種別
 * Value Object
 *
 * 名称
 * メールアドレス
 */
data class MailAddress(val value: String) {
    init {
        validate()
    }

    fun validate() {
        TODO()
    }
}
