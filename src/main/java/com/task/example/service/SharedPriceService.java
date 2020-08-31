package com.task.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.example.model.FilterTable;
import com.task.example.model.SharedPrice;
import com.task.example.repository.FilterRepository;
import com.task.example.repository.SharedPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class SharedPriceService {

    @Autowired
    public SharedPriceRepository sharedPriceRepository;

    @Autowired
    public FilterRepository filterRepository;

    String pattern = "MM/dd/yyyy HH:mm:ss";
    DateFormat df = new SimpleDateFormat(pattern);
    List<SharedPrice> newList = new ArrayList<>();

    public SharedPrice insert(SharedPrice sharedPrice) {

        Date today = Calendar.getInstance().getTime();
        String timeStamp = df.format(today);
        sharedPrice.setTimeStamp(timeStamp);
        SharedPrice prices = sharedPriceRepository.save(sharedPrice);
        return prices;
    }

    public List<SharedPrice> getList() throws IOException {

        final String uri = "https://financialmodelingprep.com/api/v3/stock/list?apikey=0dbbd75a650040eaab859d3383bf3395";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        ObjectMapper mapper = new ObjectMapper();
        List<SharedPrice> l1  = Arrays.asList(mapper.readValue(result, SharedPrice[].class));
        List<FilterTable> filterTables = filterRepository.findAll();

        for (SharedPrice sharedPrice : l1) {
            for(FilterTable f1: filterTables){
                if(f1.getSymbol().equalsIgnoreCase(sharedPrice.getSymbol())){
                    Date today = Calendar.getInstance().getTime();
                    String timeStamp = df.format(today);
                    SharedPrice sharedPriceDto = new SharedPrice();
                    sharedPriceDto.setSymbol(sharedPrice.getSymbol());
                    sharedPriceDto.setName(sharedPrice.getName());
                    sharedPriceDto.setPrice(sharedPrice.getPrice());
                    sharedPriceDto.setExchange(sharedPrice.getExchange());
                    sharedPriceDto.setTimeStamp(timeStamp);
                    sharedPriceRepository.save(sharedPriceDto);
                }
            }
        }
//        l1.stream().filter(x-> x.getSymbol().equalsIgnoreCase(sharedPriceDto.getSymbol())).collect(Collectors.toList());
//        l1.stream().filter(x-> x.getSymbol().equalsIgnoreCase(sharedPriceDto.getSymbol())).forEach(sharedPriceRepository::save);

        return l1;
    }


}
