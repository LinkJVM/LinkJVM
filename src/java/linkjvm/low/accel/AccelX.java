/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.accel;
import linkjvm.low.sensors.ShortSensor;
public class AccelX extends ShortSensor {
  private long swigCPtr;

  protected AccelX(long cPtr, boolean cMemoryOwn) {
    super(linkjvm_accelJNI.AccelX_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccelX obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_accelJNI.delete_AccelX(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public short value() {
    return linkjvm_accelJNI.AccelX_value(swigCPtr, this);
  }

  public AccelX() {
    this(linkjvm_accelJNI.new_AccelX(), true);
  }

}
