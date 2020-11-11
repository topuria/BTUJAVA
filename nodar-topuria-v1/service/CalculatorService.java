package ge.edu.CurrencyConverter.service;

public interface CurrencyService {
     void convert(int amount);
     void convert(double amount);
     void setExchangeRate(double rate);
}
