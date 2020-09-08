package com.dddsample.demo.domain.website

import com.dddsample.demo.domain.website.member.MemberList

/**
 * オブジェクト種別
 * Aggregate Root (Entity)
 *
 * 名称
 * ウェブサイト
 */
class Website(
        val id: WebsiteId,
        val slug: Slug,
        var websiteName: WebsiteName,
        var iconImage: IconImage,
        var memberList: MemberList
) {

}
