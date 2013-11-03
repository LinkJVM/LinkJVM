/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni.analog;
import io.github.linkjvm.jni.sensors.UnsignedShortSensor;
public class Analog extends UnsignedShortSensor {
  private long swigCPtr;

  protected Analog(long cPtr, boolean cMemoryOwn) {
    super(linkjvm_analogJNI.Analog_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Analog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_analogJNI.delete_Analog(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Analog(short port) {
    this(linkjvm_analogJNI.new_Analog(port), true);
  }

  public int value() {
    return linkjvm_analogJNI.Analog_value(swigCPtr, this);
  }

  public void setPullup(boolean pullup) {
    linkjvm_analogJNI.Analog_setPullup(swigCPtr, this, pullup);
  }

  public boolean pullup() {
    return linkjvm_analogJNI.Analog_pullup(swigCPtr, this);
  }

  public short port() {
    return linkjvm_analogJNI.Analog_port(swigCPtr, this);
  }

}
