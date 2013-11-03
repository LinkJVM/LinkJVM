/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni.accel;
import io.github.linkjvm.jni.sensors.ShortSensor;
public class AccelY extends ShortSensor {
  private long swigCPtr;

  protected AccelY(long cPtr, boolean cMemoryOwn) {
    super(linkjvm_accelJNI.AccelY_SWIGUpcast(cPtr), cMemoryOwn);
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
        linkjvm_accelJNI.delete_AccelY(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public short value() {
    return linkjvm_accelJNI.AccelY_value(swigCPtr, this);
  }

  public AccelY() {
    this(linkjvm_accelJNI.new_AccelY(), true);
  }

}
