package com.micka.borscha.kotlindemo.Repositories

import com.micka.borscha.kotlindemo.Entities.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ArticlesRepository : JpaRepository<Article,Long>
