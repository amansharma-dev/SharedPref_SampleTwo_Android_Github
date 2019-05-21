package com.example.sharedpref_sampletwo_android_github.SampleDataProvider;

import com.example.sharedpref_sampletwo_android_github.Model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {

    public static List<DataItem> dataItemList;
    public static Map<String,DataItem> stringDataItemMap;

    static {
        dataItemList = new ArrayList<>();
        stringDataItemMap = new HashMap<>();

        addItem(new DataItem(null,"brian_tracy.jpg","brian_tracy","eat_that_frog.jpg",7,"brian_tracy","Eat That Frog."));
        addItem(new DataItem(null,"paulo_coelho.jpg","paulo_coelho","alchemist.jpg",19,"paulo_coelho","Alchemist."));
        addItem(new DataItem(null,"garyvee.jpg","gray_vee","crush_it.jpg",4,"gray_vee","Crush It."));
        addItem(new DataItem(null,"elif_shafak.jpg","elif_shafak","forty_rules_of_love.jpg",15,"elif_shafak","Forty Rules Of Love."));
        addItem(new DataItem(null,"sadhguru.jpg","sadhguru","inner_engineering.jpg",12,"sadhguru","Inner Engineering."));
        addItem(new DataItem(null,"richard_bach.jpg","richard_bach","jonathan_seagull.jpg",23,"richard_bach","Jonathan Seagull"));

        addItem(new DataItem(null,"paulo_coelho.jpg","paulo_coelho","alchemist.jpg",19,"paulo_coelho","Alchemist."));
        addItem(new DataItem(null,"garyvee.jpg","gray_vee","crush_it.jpg",4,"gray_vee","Crush It."));
        addItem(new DataItem(null,"elif_shafak.jpg","elif_shafak","forty_rules_of_love.jpg",15,"elif_shafak","Forty Rules Of Love."));
        addItem(new DataItem(null,"brian_tracy.jpg","brian_tracy","eat_that_frog.jpg",7,"brian_tracy","Eat That Frog."));
        addItem(new DataItem(null,"sadhguru.jpg","sadhguru","inner_engineering.jpg",12,"sadhguru","Inner Engineering."));
        addItem(new DataItem(null,"richard_bach.jpg","richard_bach","jonathan_seagull.jpg",23,"richard_bach","Jonathan Seagull"));

        addItem(new DataItem(null,"elif_shafak.jpg","elif_shafak","forty_rules_of_love.jpg",15,"elif_shafak","Forty Rules Of Love."));
        addItem(new DataItem(null,"sadhguru.jpg","sadhguru","inner_engineering.jpg",12,"sadhguru","Inner Engineering."));
        addItem(new DataItem(null,"paulo_coelho.jpg","paulo_coelho","alchemist.jpg",19,"paulo_coelho","Alchemist."));
        addItem(new DataItem(null,"brian_tracy.jpg","brian_tracy","eat_that_frog.jpg",7,"brian_tracy","Eat That Frog."));
        addItem(new DataItem(null,"richard_bach.jpg","richard_bach","jonathan_seagull.jpg",23,"richard_bach","Jonathan Seagull"));
        addItem(new DataItem(null,"garyvee.jpg","gray_vee","crush_it.jpg",4,"gray_vee","Crush It."));



        addItem(new DataItem(null,"brian_tracy.jpg","brian_tracy","eat_that_frog.jpg",7,"brian_tracy","Eat That Frog."));
        addItem(new DataItem(null,"paulo_coelho.jpg","paulo_coelho","alchemist.jpg",19,"paulo_coelho","Alchemist."));
        addItem(new DataItem(null,"garyvee.jpg","gray_vee","crush_it.jpg",4,"gray_vee","Crush It."));
        addItem(new DataItem(null,"elif_shafak.jpg","elif_shafak","forty_rules_of_love.jpg",15,"elif_shafak","Forty Rules Of Love."));
        addItem(new DataItem(null,"sadhguru.jpg","sadhguru","inner_engineering.jpg",12,"sadhguru","Inner Engineering."));
        addItem(new DataItem(null,"richard_bach.jpg","richard_bach","jonathan_seagull.jpg",23,"richard_bach","Jonathan Seagull"));

        addItem(new DataItem(null,"paulo_coelho.jpg","paulo_coelho","alchemist.jpg",19,"paulo_coelho","Alchemist."));
        addItem(new DataItem(null,"garyvee.jpg","gray_vee","crush_it.jpg",4,"gray_vee","Crush It."));
        addItem(new DataItem(null,"elif_shafak.jpg","elif_shafak","forty_rules_of_love.jpg",15,"elif_shafak","Forty Rules Of Love."));
        addItem(new DataItem(null,"brian_tracy.jpg","brian_tracy","eat_that_frog.jpg",7,"brian_tracy","Eat That Frog."));
        addItem(new DataItem(null,"sadhguru.jpg","sadhguru","inner_engineering.jpg",12,"sadhguru","Inner Engineering."));
        addItem(new DataItem(null,"richard_bach.jpg","richard_bach","jonathan_seagull.jpg",23,"richard_bach","Jonathan Seagull"));

        addItem(new DataItem(null,"elif_shafak.jpg","elif_shafak","forty_rules_of_love.jpg",15,"elif_shafak","Forty Rules Of Love."));
        addItem(new DataItem(null,"sadhguru.jpg","sadhguru","inner_engineering.jpg",12,"sadhguru","Inner Engineering."));
        addItem(new DataItem(null,"paulo_coelho.jpg","paulo_coelho","alchemist.jpg",19,"paulo_coelho","Alchemist."));
        addItem(new DataItem(null,"brian_tracy.jpg","brian_tracy","eat_that_frog.jpg",7,"brian_tracy","Eat That Frog."));
        addItem(new DataItem(null,"richard_bach.jpg","richard_bach","jonathan_seagull.jpg",23,"richard_bach","Jonathan Seagull"));
        addItem(new DataItem(null,"garyvee.jpg","gray_vee","crush_it.jpg",4,"gray_vee","Crush It."));

    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        stringDataItemMap.put(item.getUserId(),item);
    }
}
