package com.example.weatherapp_cs321;

import java.util.ArrayList;

/**
 * The main function of the app. Retrieves temperature and additional data
 * to output a clothing suggestion.
 *
 * @author Evan Ritchey
 * @since 2019-11-08
 * @version 1.0
 *
 * Note:
 * rain_chance and humidity is a %
 * wind_speed is in mph
 * precipitation is windy/snow showers/cloudy/mostly cloudy/sunny etc.
 */
public class SuggestionCalculation {

    private ArrayList<String> allClothes = new ArrayList<>();

    public SuggestionCalculation() {
        allClothes.add("tshirt_light");
        allClothes.add("tshirt_dark");
        allClothes.add("longsleeveshirt");
        allClothes.add("shorts");
        allClothes.add("longpants");
        allClothes.add("umbrella");
        allClothes.add("sunglasses");
        allClothes.add("jacket");
        allClothes.add("coat");
    }

    public String[] suggestion(int temperature, int rain_chance, int humidity, int wind_speed, String precipitation){
        //TODO: the BIGGEST one - mondai | dummy data right now
        int suggest_size = 0;

        if(precipitation == "rainy" || precipitation == "sunny" || precipitation == "snowy")
            suggest_size++;
        //TODO etc. still need cases for a few other things

        suggest_size = temperature + rain_chance + humidity + wind_speed;
        suggest_size = 3;
        String[] suggestion_list = new String[suggest_size];//TODO for loop assigning each index a suggestion item from allClothes
        suggestion_list[0] = allClothes.get(0);
        suggestion_list[1] = allClothes.get(1);
        suggestion_list[2] = allClothes.get(2);
        return suggestion_list;
    }
}
