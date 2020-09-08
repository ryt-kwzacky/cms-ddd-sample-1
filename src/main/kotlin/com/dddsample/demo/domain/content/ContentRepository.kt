package com.dddsample.demo.domain.content

/**
 * オブジェクト種別
 * Repository
 *
 * 名称
 * コンテンツ用リポジトリ
 */
interface ContentRepository {
    fun retrieveById(id: ContentId): Content?

    fun store(content: Content)

    fun remove(content: Content)
}
