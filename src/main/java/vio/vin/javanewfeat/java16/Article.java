package vio.vin.javanewfeat.java16;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

public record Article(String title, String content, Date date, Integer views, boolean isDelete) {

}

@Slf4j
class AppArticle
{
    public static void main(String[] args)
    {
        Article article = new Article("title", "content", new Date(), 1000, false);

        log.info(article.title());
        log.info(article.content());
        log.info(article.toString());
    }
}