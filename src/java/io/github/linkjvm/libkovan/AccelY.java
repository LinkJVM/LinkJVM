/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.libkovan;

public class AccelY extends shortSensor {
  private long swigCPtr;

  protected AccelY(long cPtr, boolean cMemoryOwn) {
    super(LinkJVMJNI.AccelY_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccelY obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_AccelY(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public short value() {
    return LinkJVMJNI.AccelY_value(swigCPtr, this);
  }

  public AccelY() {
    this(LinkJVMJNI.new_AccelY(), true);
  }

}
