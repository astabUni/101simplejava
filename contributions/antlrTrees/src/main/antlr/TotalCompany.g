tree grammar TotalCompany;

options { 
  tokenVocab=Company;
  ASTLabelType=CommonTree;
}

@header {
package org.softlang.company.antlr;
}

@members {

public double total = 0;

}

company :
  ^(COMPANY STRING dept*)
  ;
  
dept :
  ^(DEPT STRING manager employee* dept*)
  ;
    
manager : 
  ^(MANAGER employee)
  ;   
    
employee :
  ^(EMPLOYEE STRING STRING FLOAT)
  { total += Double.parseDouble($FLOAT.text); }
  ;
