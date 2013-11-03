/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;
import io.github.linkjvm.jni.sensors.BoolSensor;
public class Digital extends BoolSensor {
  private long swigCPtr;

  protected Digital(long cPtr, boolean cMemoryOwn) {
    super(linkjvm_digitalJNI.Digital_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Digital obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_digitalJNI.delete_Digital(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Digital(short port) {
    this(linkjvm_digitalJNI.new_Digital(port), true);
  }

  public void setValue(boolean value) {
    linkjvm_digitalJNI.Digital_setValue(swigCPtr, this, value);
  }

  public boolean value() {
    return linkjvm_digitalJNI.Digital_value(swigCPtr, this);
  }

  public void setOutput(boolean output) {
    linkjvm_digitalJNI.Digital_setOutput(swigCPtr, this, output);
  }

  public boolean isOutput() {
    return linkjvm_digitalJNI.Digital_isOutput(swigCPtr, this);
  }

  public void setPullup(boolean pullup) {
    linkjvm_digitalJNI.Digital_setPullup(swigCPtr, this, pullup);
  }

  public boolean pullup() {
    return linkjvm_digitalJNI.Digital_pullup(swigCPtr, this);
  }

}
