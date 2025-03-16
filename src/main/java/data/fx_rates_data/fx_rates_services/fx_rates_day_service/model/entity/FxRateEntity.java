package data.fx_rates_data.fx_rates_services.fx_rates_day_service.model.entity;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table( name="fx_rates_data" , schema =  "fx_rates_schema")
public record FxRateEntity(
    
	@Id 
    @Column("foreign_exchange_rate_id") 
    UUID id,

    @Column("foreign_exchange_rate_timestamp") 
    OffsetDateTime rateTimestamp,

    @Column("foreign_exchange_rate_base_currency") 
    String baseCurrency,

    @Column("foreign_exchange_rate_quote_currency") 
    String quoteCurrency,

    @Column("foreign_exchange_rate_type") 
    String rateType,

    @Column("foreign_exchange_rate_date") 
    LocalDate rateDate
) {}
