package me.dio.soccernews.data.remode;

import java.util.List;

import me.dio.soccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {


    @GET("news.json")
    Call<List<News>> getNews();
}
