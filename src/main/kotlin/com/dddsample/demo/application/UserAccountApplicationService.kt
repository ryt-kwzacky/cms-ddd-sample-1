package com.dddsample.demo.application

import com.dddsample.demo.domain.userAccount.MailAddress
import com.dddsample.demo.domain.userAccount.Password
import com.dddsample.demo.domain.userAccount.UserAccount
import com.dddsample.demo.domain.userAccount.UserAccountId
import com.dddsample.demo.domain.userAccount.UserAccountRepository

class UserAccountApplicationService(
        private val userAccountRepository: UserAccountRepository
) {
    // 会員登録をする
    fun signUp(
            mailAddress: MailAddress,
            password: Password
    ): UserAccountId {
        val newUserAccount = UserAccount.create(
                id = userAccountRepository.nextIdentifier(),
                mailAddress = mailAddress,
                password = password
        )
        userAccountRepository.store(newUserAccount)

        return newUserAccount.id
    }

    // メールアドレスを変更する
    fun changeMailAddress() {
        TODO()
    }

    // パスワードを変更する
    fun changePassword() {
        TODO()
    }
}
