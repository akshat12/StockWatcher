package com.google.gwt.sample.stockwatch.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

// This is an entirely different line now. 

public interface StockServiceAsync {
  public void addStock(String symbol, AsyncCallback<Void> async);
  public void removeStock(String symbol, AsyncCallback<Void> async);
  
// Changing stuff here trying to create a conflict
  public void getStocks(AsyncCallback<String[]> async);
}