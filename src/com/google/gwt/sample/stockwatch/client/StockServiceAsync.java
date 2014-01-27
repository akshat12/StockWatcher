package com.google.gwt.sample.stockwatch.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

// Pretend to change stuff

public interface StockServiceAsync {
  public void addStock(String symbol, AsyncCallback<Void> async);
  public void removeStock(String symbol, AsyncCallback<Void> async);
  
  public void getStocks(AsyncCallback<String[]> async);
}