package com.dddsample.demo.domain.userAccount

/**
 * オブジェクト種別
 * Aggregate Root (Entity)
 *
 * 名称
 * ユーザーアカウント
 */
class UserAccount(
        val id: UserAccountId,
        var mailAddress: MailAddress,
        var passwordHash: PasswordHash
) {

}
