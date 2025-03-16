package data.fx_rates_data.fx_rates_services.fx_rates_day_service.repository;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import data.fx_rates_data.fx_rates_services.fx_rates_day_service.model.entity.FxRateEntity;

@Repository
public interface FxRatesRepository extends PagingAndSortingRepository<FxRateEntity, UUID> {

    Page<FxRateEntity> findByRateDate(LocalDate rateDate, Pageable pageable);

    Page<FxRateEntity> findByRateDateBetween(LocalDate startDate, LocalDate endDate, Pageable pageable);
}
