package com.tamji.lab.cpe.neko_note;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("posts") // Endpoint
    Call<List<TextNote>> getTextNote();
}