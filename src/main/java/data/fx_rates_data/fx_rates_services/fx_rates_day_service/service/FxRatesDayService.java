package data.fx_rates_data.fx_rates_services.fx_rates_day_service.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import data.fx_rates_data.fx_rates_services.fx_rates_day_service.model.entity.FxRateEntity;
import data.fx_rates_data.fx_rates_services.fx_rates_day_service.repository.FxRatesRepository;

@Service
public class FxRatesDayService {
	
	private static final int STANDARD_PAGE_SIZE = 100;

	private static final String SORT_KEY = "rateTimestamp";

	@Autowired
    private FxRatesRepository fxRatesRepository;

    public Page<FxRateEntity> getRatesByDate(LocalDate date, int page) {
    	
        Pageable pageable = createPageableWithSort(page);
        
        return fxRatesRepository.findByRateDate(date, pageable);
    }
    
    public Page<FxRateEntity> getRatesByDateRange(LocalDate startDate, LocalDate endDate, int page) {
        Pageable pageable = createPageableWithSort(page);
        return fxRatesRepository.findByRateDateBetween(startDate, endDate, pageable);
    }

	private Pageable createPageableWithSort(int page) {
		Pageable pageable = PageRequest.of(page, STANDARD_PAGE_SIZE, Sort.by(Order.asc(SORT_KEY)));
		return pageable;
	}


}

