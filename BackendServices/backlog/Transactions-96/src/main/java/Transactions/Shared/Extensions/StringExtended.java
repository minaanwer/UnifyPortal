package Transactions.Shared.Extensions;

public  class StringExtended {

    public static Boolean  IsNullOrEmpty(String txt){
      return  txt.isEmpty() || txt.equals(null);
  }

}
