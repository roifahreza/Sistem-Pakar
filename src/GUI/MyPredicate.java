/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.util.function.Predicate;

/**
 *
 * @author RO'I FAHREZA
 */

class MyPredicate<T> implements Predicate<T>{
  T var1;
  public boolean test(T var){
  if(var1.equals(var)){
   return true;
  }
  return false;
  }
}
