package com.dddsample.demo.domain.contentFormat

/**
 * オブジェクト種別
 * Repository
 *
 * 名称
 * フィールド形式用リポジトリ
 */
interface ContentFormatRepository {
    fun retrieveById(id: ContentFormatId): ContentFormat?

    fun store(contentFormat: ContentFormat)

    fun remove(contentFormat: ContentFormat)
}
