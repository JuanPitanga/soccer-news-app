package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> mNews;

    public NewsViewModel() {
        this.mNews = new MutableLiveData<>();

        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        news.add(new News("Ferrinha joga no sabado","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        news.add(new News("Copa do mundo feminina esta terminando","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));

       this.mNews.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return mNews;
    }
}