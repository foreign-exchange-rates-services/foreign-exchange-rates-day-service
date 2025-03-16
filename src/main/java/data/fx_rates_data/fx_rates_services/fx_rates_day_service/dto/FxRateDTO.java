package data.fx_rates_data.fx_rates_services.fx_rates_day_service.dto;

import java.math.BigDecimal;
import java.util.Date;

import data.fx_rates_data.fx_rates_services.fx_rates_day_service.values.FXCurrency;
import data.fx_rates_data.fx_rates_services.fx_rates_day_service.values.FXRateTypes;

public record FxRateDTO(
	String rateId,
    FXCurrency baseCurrency,
    FXCurrency quoteCurrency,
    Date timestamp,
    BigDecimal rate,
    FXRateTypes rateType
) {}
