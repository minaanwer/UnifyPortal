package Transactions.Shared.Extensions;

public  class StringExtension {

    public static Boolean  IsNullOrEmpty(String txt){
      return  txt.equals(null)  ||txt.isEmpty() ;
  }

}
