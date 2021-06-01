package TP2.autogen;

import TP2.autogen.CounterOperations;
import TP2.autogen.CounterPOA;

/**
* CounterPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Counter.idl
* jeudi 27 mai 2021 10 h 41 WEST
*/

public class CounterPOATie extends CounterPOA
{

  // Constructors

  public CounterPOATie ( CounterOperations delegate ) {
      this._impl = delegate;
  }
  public CounterPOATie ( CounterOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public CounterOperations _delegate() {
      return this._impl;
  }
  public void _delegate (CounterOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public int value ()
  {
    return _impl.value();
  } // value

  public void inc ()
  {
    _impl.inc();
  } // inc

  public void dec ()
  {
    _impl.dec();
  } // dec

  private CounterOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class CounterPOATie